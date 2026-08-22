package lista01;

    public class Exercicio22 {
    public static void main(String[] args) {

        //Criando um aluno com nome e duas notas
        Aluno aluno1 = new Aluno("Daniel Plinio", 8.5, 9.0);

        System.out.println("======================================");
        System.out.println("        FICHA DE DESEMPENHO           ");
        System.out.println("======================================");
        
        //Exibindo os dados e a média calculada
        aluno1.mostrarDados();

        System.out.println("======================================");
    }
}