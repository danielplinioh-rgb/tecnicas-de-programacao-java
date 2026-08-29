package lista01;

public class Exercicio26 {
    public static void main(String[] args) {
        
    //Instanciando dois objetos independentes (classe ContaBancaria)
    ContaBancaria contaGiulia = new ContaBancaria("Giulia Lelis", "1001-X", 1000.00);
    ContaBancaria contaDaniel = new ContaBancaria("Daniel Plinio", "2002-Y", 500.00);

    System.out.println("========================================");
    System.out.println("        ESTADO INICIAL DAS CONTAS       ");
    System.out.println("========================================");
    contaGiulia.mostrarSaldo();
    contaDaniel.mostrarSaldo();

    //Operações isoladas para cada objeto
    System.out.println("---------------------------------------------------");
    System.out.println("              EXECUTANDO OPERAÇÕES ISOLADAS        ");
    System.out.println("---------------------------------------------------");
    System.out.println("> Operação na conta de Giulia:");
    contaGiulia.depositar(500.00); 

    System.out.println("\n> Operação na conta de Daniel");
    contaDaniel.sacar(200.00);

    //Demonstrando que os saldos se mantiveram independentes
    System.out.println("-------------------------------------");
    System.out.println("         SALDO FINAL DAS CONTAS      ");
    System.out.println("-------------------------------------");
    contaGiulia.mostrarSaldo();
    contaDaniel.mostrarSaldo();
    
    }
}