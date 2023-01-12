public class Exercise {
    private String statement;
    private String solution;
    private String answer;

    Exercise init(String statement, String solution, String answer){
        this.statement = statement;
        this.solution = solution;
        this.answer = answer;
        return this;
    }

    public void show(){
        System.out.println("Enunciado: " + this.statement);
        System.out.println("Solução: " + this.solution);
        System.out.println("Resposta: " + this.answer);
    }
}
