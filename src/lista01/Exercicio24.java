package lista01;

public class Exercicio24 {
    public static void main(String[] args) {
        //Instanciando uma lâmpada de cor "Amarela"
        Lampada lampada1 = new Lampada("Amarela");

        System.out.println("================================");
        System.out.println("        CONTROLE DE LÂMPADA     ");
        System.out.println("================================");
    
        //Estado inicial (Desligada)

        lampada1.mostrarEstado();

        //Ligar
        System.out.println("\n--- Ação: Ligar ---");
        lampada1.ligar();
        lampada1.mostrarEstado();

        //Desligar
        System.out.println("\n--- Ação: Desligar ---");
        lampada1.desligar();
        lampada1.mostrarEstado();

        System.out.println("================================");
    }
}
