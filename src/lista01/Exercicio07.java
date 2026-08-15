package lista01;

public class Exercicio07 {
    public static void main(String[] args) {
        //Inicializando variáveis
        int A = 10;
        int B = 20;

        System.out.println("--- ANTES DA TROCA ---");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        //Invertendo valores com a terceira variável auxiliar
        int aux = A; //aux recebe o valor de A
        A = B; //A recebe o valor de B
        B = aux; //B recebe o valor de A, agora contido na auxiliar
       
        System.out.println("--- DEPOIS DA TROCA ---");
        System.out.println("A = " +  A);
        System.out.println("B = " +  B);
    }
}
