package lista01;

public class Exercicio23 {
    public static void main(String[] args) {
        //Instanciando uma nova conta com saldo inicial de R$ 500,00
        ContaBancaria conta = new ContaBancaria("Carlos Eduardo", "12345-6", 500.000);

        System.out.println("=====================================");
        System.out.println("            CONTA BANCÁRIA"           );
        System.out.println("=====================================");
    
        //Saldo Inicial 
        conta.mostrarSaldo();

        //Realizando um depósito
        System.out.println("\n--- Operação: Depósito ---");
        conta.depositar(200.00);
        conta.mostrarSaldo();

        //Realizando um saque maior que o saldo (fica negativo)
        System.out.println("\n--- Operação: Saque maior que o saldo ---");
        conta.sacar(1000.00);
        conta.mostrarSaldo();

        System.out.println("=====================================");
    }
}
