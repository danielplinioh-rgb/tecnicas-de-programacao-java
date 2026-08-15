package lista01;

public class Exercicio12 {
    public static void main(String[] args) {
        //Temperatura em celsius
        double ceusius = 60.0;
        
        //Calculando conversão para Fahrenheit (F = C * 9 / 5 + 32)
        double fahrenheit = (ceusius * 9 / 5) + 32;

        //Exibindo resultados
        System.out.println("===== CONVERTENDO CEUSIUS PARA FAHRENHEIT =====");
        System.out.println("Temperatura em Celsius: " + ceusius + "°C");
        System.out.printf("Temperatura em Fahrenheit: %.1f°F%n", fahrenheit);
        System.out.println("===========================================");
    }
}