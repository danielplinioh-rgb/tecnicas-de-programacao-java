package autoestudo02.exercicio4;

public class MainFormas {
    public static void main(String[] args) {
        //Tipo de referência é genérico, objeto é específico
        Forma f1 = new Retangulo(10, 5);
        Forma f2 = new Circulo(3);

        //A execução depende do objeto instanciado
        System.out.println("Área do Retângulo: " + f1.calcularArea());
        System.out.printf("Área do Círculo: %.2f%n", f2.calcularArea());
    }
}
