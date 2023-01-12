public class App {
    public static void main(String[] args) {
        String statement = "Qual o resultado de somar 40 com 2?";
        String solution = "Usando uma calculadora podemos somar 40 com 2 e chegar na resposta";
        String answer = "A resposta é 42";
        Exercise exercise = new Exercise().init(statement, solution, answer);

        String author = "Mateus Kuritza";
        String name = "Livro de JAVA";
        int publicationYear = 2023;
        Book book = new Book();
        book.setAuthor(author);
        book.setName(name);
        book.setPublicationYear(publicationYear);
        book.setExercise(exercise);
        book.show();
    }
 
}
