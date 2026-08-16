package lista01;

public class Exercicio13 {
    public static void main(String[] args) {
        //Declarando quantidade de segundos para conversão
        int totalSegundos = 3665;

        //Cálculos
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60; 

        //Exibindo conversões
        System.out.println("==== CONVERTENDO SEGUNDOS EM HORAS, MINUTOS E SEGUNDOS RESTANTES ====");
        System.out.println("Total informado: " + totalSegundos + " segundos");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%d hora(s), %d minuto(s) e %d segundo(s)%n", horas, minutos, segundos);
        System.out.println("=====================================================================");
        
    }
}
