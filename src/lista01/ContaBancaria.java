package lista01;

public class ContaBancaria {
    
    private String titular;
    private String numero;
    private double saldo;

     //Construtor para inicializar os atributos

    public ContaBancaria (String titular, String numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero ;
        this.saldo = saldoInicial;

    }

    //Método para depositar (aumenta o saldo)
    public void depositar(double valor) {
        this.saldo += valor; //Equivalente a: this.saldo = this.saldo + valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso. %n", valor);
    }

    //Método para sacar (diminui o saldo - sem restrição nesta versão)
    public void sacar(double valor) {
        this.saldo -= valor; ////Equivalente a: this.saldo = this.saldo - valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso. %n", valor);
    }

    //Método para exibir o extrato simples
    public void mostrarSaldo() {
        System.out.println("-------------------------------------------------");
        System.out.printf("Titular      : %s%n", this.titular);
        System.out.printf("Conta      : %s%n", this.numero);
        System.out.printf("Saldo      : R$ %.2f%n", this.saldo);
    }

    //Getters e Sellers
    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) {this.numero = numero; }

    public double getSaldo() { return saldo; }
}


