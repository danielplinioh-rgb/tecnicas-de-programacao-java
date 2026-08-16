package lista01;

public class Exercicio14 {
    public static void main(String[] args) {
        //Informando preço do produto
        double valorProduto1 = 24.99;
        double valorPago = 30.0;
        
        //Calculando troco
        double troco = valorPago - valorProduto1;

        //Exibindo troco
        System.out.println("O valor do produto 1 é: " + valorProduto1);
        System.out.println("O valor pago pelo cliente foi de: R$ " + valorPago);
        System.out.printf("O troco a ser devolvido, portanto, deverá ser: R$ %.2f%n", troco);

    }
}
