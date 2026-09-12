package autoestudo02.exercicio2;

public class Aluno {

    private String nome;
    private double primeiraNota;
    private double segundaNota;

    public Aluno(String nome) {
        this.nome = nome;
    }
    
    //Setters solicitam alterações e validam as regras
    public void setPrimeiraNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.primeiraNota = nota;
        } else {
            System.out.println("Nota 1 inválida.");
        }
    }

    public void setSegundaNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.segundaNota = nota;
        } else {
            System.out.println("Nota 2 inválida.");
        }
    }

    public double calcularMedia() {
        return (primeiraNota + segundaNota) / 2;
    }

    public void mostrarDados() {
        System.out.println("Aluno: " + nome + " | Média: " + calcularMedia());
    }
}

