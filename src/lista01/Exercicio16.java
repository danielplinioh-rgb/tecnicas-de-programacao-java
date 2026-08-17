package lista01;

    import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
    //Instanciando o leitor do teclado 
    Scanner scanner = new Scanner(System.in);
    
    //Lendo os dados do usuário
    System.out.print("Digite seu nome completo: ");
    String nome = scanner.nextLine();

    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();

    //Limpando o buffer 
    scanner.nextLine();

    System.out.print("Digite seu curso: ");
    String curso = scanner.nextLine();

    //Exibindo ficha

    System.out.printf("Nome: %s%n", nome);
    System.out.printf("Idade: %d anos%n", idade);
    System.out.printf("Curso: %s%n", curso);

    //Fechamento do Scanner
    scanner.close();

    }
}
