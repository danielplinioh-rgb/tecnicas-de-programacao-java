package lista01;

    import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Leitura da palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next();

        //Processamento das informações
        int tamanho = palavra.length();
        char primeiroCaractere = palavra.charAt(0);
        char ultimoCaractere = palavra.charAt(tamanho -1);

        //Exibindo dados
        System.out.printf("Palavra digitada     :%s%n", palavra);
        System.out.printf("Tamanho              :%d caracteres%n", tamanho);
        System.out.printf("Primeiro caractere   :%c%n", primeiroCaractere);
        System.out.printf("Último caractere     :%c%n", ultimoCaractere);

        scanner.close();
    }
}
