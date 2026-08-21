package lista01;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Entrada dos números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        //Processamento (operações Aritméticas)
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        
        //Exibição da Calculadora 
        System.out.println("\n=================================");
        System.out.println("           CALCULADORA             ");
        System.out.println("===================================");
        System.out.printf("Númeero 1 : %.2f%n", num1);   
        System.out.printf("Número 2 : %.2f%n", num2);
        System.out.println("-----------------------------------");
        System.out.printf("Soma            (+) : %.2f%n", soma);
        System.out.printf("Subtração       (-) :  %.2f%n", subtracao);
        System.out.printf("Multiplicação   (*) :  %.2f%n", multiplicacao);

        //Validação da divisão por zero

        if (num2 !=0) {
            double divisao = num1 / num2;
            System.out.printf("Divisão     (/) : %.2f", divisao);
        } else {    
            System.out.println("Divisão     (/) : Indeterminada (Divisão por Zero)");
        }

        System.out.println("\n====================================");

        scanner.close();
    }
}
