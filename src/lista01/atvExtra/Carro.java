package lista01.atvExtra;

public class Carro {

    String marca;
    String cor;
    String modelo;
    int velocidade;

    int ano;
    String combustivel;
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println("Carro ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
    }

    void buzinar() {
        System.out.println("Biiiiip!");
    }

    void acelerar() {
        if (ligado) {
            velocidade = velocidade + 10;
        } else {
            System.out.println("Não é possível acelerar: o carro está desligado!");
        }
    }

    void frear() {
        velocidade = velocidade - 10;
    }

    void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Ano: " + ano);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Ligado: " + ligado);
        System.out.println();
    }
}