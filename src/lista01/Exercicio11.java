package lista01;

public class Exercicio11 {
    public static void main(String[] args) {
    //Declarando base x altura
    double altura = 8.7; 
    double base = 11.4;

    //Cálculo da área
    double area = base * altura;

    //Exibição do resultado
    System.out.println("======= CÁLCULO DA ÁREA DO RETÂNGULO ======");
    System.out.println("Base: " + base);
    System.out.println("Altura: " + altura);
    System.out.println("------------------------");
    System.out.println("Área = Base x Altura");
    System.out.printf("Área: %.1f%n", area);
    }
}