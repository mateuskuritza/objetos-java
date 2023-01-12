public class Book {
    private String author;
    private String name;
    private int publicationYear;
    private Exercise exercise;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public void show(){
        System.out.println("Autor: " + this.author);
        System.out.println("Nome do livro: " + this.name);
        System.out.println("Ano de publicação: " + this.publicationYear);
        System.out.println("----------------- Exercicio -----------------");
        this.exercise.show();
    }
}
