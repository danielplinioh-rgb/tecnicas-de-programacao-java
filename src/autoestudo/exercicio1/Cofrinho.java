package autoestudo.exercicio1;

public class Cofrinho {
    // Atributos privados
    private String objetivo;
    private double saldo;

    //Construtor: Exige o objeto na criação e inicia o saldo zerado
    public Cofrinho(String objetivo) {
        this.objetivo = objetivo;
        this.saldo = 0.0;
    }

    //Getters para consulta (sem Setter para saldo)
    public String getObjetivo() {
        return objetivo;
    } 

    public double getSaldo() {
        return saldo;
    }
    
    //Regra de negócio: Depósito (Apenas valores estritamente positivos)
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Depósito inválido. O valor deve ser maior que zero.");
        }
    }

    //Regra de negócio: Retirada (Valor positivo e não superior ao saldo disponível)
    public void retirar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Retirada inválida.");
        }
    }

    //Exibição resumida dos dados do cofrinho
    public void mostrarResumo() {
        System.out.println("====================================");
        System.out.println("         RESUMO DO COFRINHO         ");
        System.out.println("====================================");
        System.out.printf("Objetivo  : %s%n", this.objetivo);
        System.out.printf("Saldo  : R$ %.2f%n", this.saldo);
        System.out.println("====================================");
    }
}
