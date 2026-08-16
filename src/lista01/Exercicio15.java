package lista01;

public class Exercicio15 {
    public static void main(String[] args) {
        //Declarando distância percorrida e consumo
        double distanciaKm = 470.5;
        double combustivelLitros = 35.7;
        
        //Cálculo de consumo médio
        double consumoMedio = distanciaKm / combustivelLitros;

        //Exibindo resultados
        System.out.printf("Determinado veículo percorreu %.1f Km%n ", distanciaKm);
        System.out.printf("Foi registrado um consumo de %.1fL%n", combustivelLitros);
        System.out.println("Sabendo que o consumo médio é dado por: Distância / Combustível");
        System.out.printf("O consumo médio foi de: %.2f Km/L%n", consumoMedio);
    }
}
