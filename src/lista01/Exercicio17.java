package lista01;
    
    import java.util.Scanner;

    public class Exercicio17 {
    
        public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);

        //Capturando nome e sobrenome
        System.out.print("Digite seu primeiro nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        //Manipulação das Strings
        String nomeCompleto = nome + " " + sobrenome;
        String nomeMaiusculo = nomeCompleto.toUpperCase();
        int quantidadeCaracteres = nomeCompleto.length();

        //Exibição dos dados capturados
        System.out.printf("Nome completo: %s%n", nomeCompleto);
        System.out.printf("Nome completo (em maiúsculo): %s%n", nomeMaiusculo);
        System.out.printf("Quantidade de caractéres (contando com espaço): %d%n", quantidadeCaracteres);                                                       

        scanner.close();
    }
}
