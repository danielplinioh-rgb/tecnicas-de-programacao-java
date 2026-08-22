package lista01;

public class Aluno {

    //Atributos privados
    private String nome;
    private double nota1;
    private double nota2;

    //Construtor para inicializar os atributos

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //Método para calcular e retornar a média aritmética
    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2.0;
    }

    //Método para exibir a ficha do aluno
    public void mostrarDados () {
        System.out.println("----------------------------------------");
        System.out.printf("Aluno            : %s%n", this.nome);
        System.out.printf("Nota 1           : %.1f%n", this.nota1);
        System.out.printf("Nota 2           : %.1f%n", this.nota2);
        System.out.printf("Média Final      : %.1f%n", calcularMedia());
    }

    //Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getNota1() { return nota1; }
    public void setNota1(double nota1) { this.nota1 = nota1; }
    
    public double getNota2() { return nota2; }
    public void  setNota2(double nota2) { this.nota2 = nota2; }     
}
