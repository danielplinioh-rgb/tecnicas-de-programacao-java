package autoestudo.exercicio3;

public class Main {
    public static void main(String[] args) {
        //Criando um único objeto Calculadora
        Calculadora calculadora = new Calculadora();

        //O compilador escolhe a versão correta de somar() com base nos argumentos
        int resultado1 = calculadora.somar(10, 20); //Esperado: 30
        double resultado2 = calculadora.somar(2.5, 3.8); //Esperado: 6.3
        int resultado3 = calculadora.somar(1, 2, 3); //Esperado: 6

        //Exibindo resultados no console

        System.out.println("==================================");
        System.out.println("    POLIMORFISMO POR SOBRECARGA   ");
        System.out.println("==================================");
        System.out.println("Soma de 2 inteiros (10, 20) : " + resultado1);
        System.out.println("Soma de 2  doubles (2.5, 3.8) : " + resultado2);
        System.out.println("Soma de 3 inteiros (1, 2, 3) : " + resultado3);
        System.out.println("==================================");
    }
}
