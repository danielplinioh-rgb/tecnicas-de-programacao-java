package lista01;

import java.util.Scanner;

    public class Exercicio18 {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Capturando nome e sobrenome
        System.out.print("Digite seu primeiro nome: ");
        String nome = scanner.nextLine().trim();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine().trim();

        //Extraindo e convertendo as iniciais
        char inicialNome = Character.toUpperCase(nome.charAt(0));
        char inicialSobrenome = Character.toUpperCase(sobrenome.charAt(0));

        //Exibição dos dados
        System.out.println("\n=======================================");
        System.out.printf("Nome digitado: %s %s%n", nome, sobrenome);
        System.out.printf("Iniciais: %c.%c.%n", inicialNome, inicialSobrenome);
        System.out.println("========================================");

        scanner.close();
    }
}
