package autoestudo02.exercicio2;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos");
        aluno.setPrimeiraNota(8.5);
        aluno.setSegundaNota(12.0); //Inválido, será ignorado (mantendo 0.0)
        aluno.mostrarDados();
    }
}
