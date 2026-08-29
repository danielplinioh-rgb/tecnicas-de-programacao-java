package lista01.atvExtra;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.cor = "Vermelho";
        carro1.velocidade = 0;

        carro1.ano = 2020;
        carro1.combustivel = "Flex";
        carro1.ligado = false;

        System.out.println("Estado Inicial:");
        carro1.mostrarDados();

        System.out.println("Tentando acelerar com o carro desligado...");
        carro1.acelerar();
        System.out.println();

        System.out.println("Ligando o carro...");
        carro1.ligar();
        
        System.out.println("Buzinando...");
        carro1.buzinar();

        System.out.println("Acelerando...");
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.mostrarDados();

        System.out.println("Freando...");
        carro1.frear();
        carro1.mostrarDados();

        System.out.println("Desligando o carro...");
        carro1.desligar();
        carro1.mostrarDados();
    }
}

