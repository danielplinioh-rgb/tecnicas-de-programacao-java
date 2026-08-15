package lista01;

public class Exercicio09 {
    public static void main(String[] args) {
        //Atribuido dois números
        int numero1 = 6;
        int numero2 = 7;

        //Realizando operações
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2; //Conversão (cast) para manter casas decimais após divisão, sem truncamento
        int resto = numero1 % numero2;

        //Exibindo resultados das operações
        System.out.println("==============================");
        System.out.println("     OPERAÇÕES ARITMÉTICAS    ");
        System.out.println("==============================");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("------------------------------");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da Divisão: " + resto);
        System.out.println("==============================");
    }
}
