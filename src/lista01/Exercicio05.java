package lista01;

public class Exercicio05 {
    public static void main(String[] args) {
       //Declaração e inicialização das variáveis
        String nome = "Daniel Plinio";
        int idade = 19;
        double altura = 1.72;
        double nota = 9.5;
        boolean estaMatriculado = true;

        //Exibição dos dados utilizando concatenação com o operador +
        System.out.println("============================");
        System.out.println("      DADOS DO ESTUDANTE    ");
        System.out.println("============================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        System.out.println("Nota: " + nota);
        System.out.println("Situação da Matrícula (Ativo)?: " + estaMatriculado);
        System.out.println("============================");
    }
}
