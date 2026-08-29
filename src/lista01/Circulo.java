package lista01;

public class Circulo {
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    //Método para calcular a Área
    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    //Método para calcular a Circunferência (Perímetro)
    public double calcularCircunferencia() {
        return 2 * Math.PI * this.raio;
    }

    public void mostrarDados() {
        System.out.println("---------------------------------------------");
        System.out.printf("Raio do Círculo : %.2f%n", this.raio);
        System.out.printf("Área            :%.2f%n", calcularArea());
        System.out.printf("Raio do Círculo : %.2f%n", calcularCircunferencia());
    }

    public double getRaio() {return raio; }
    public void setRaio(double raio) {this.raio = raio; } 
}
