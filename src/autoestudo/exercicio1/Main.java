package autoestudo.exercicio1;

public class Main {
    public static void main(String[] args) {
        //Criando cofrinho com o objetivo "Viagem"  
        Cofrinho cofrinho = new Cofrinho("Viagem");

        //Operações Válidas
        cofrinho.depositar(500.00);
        cofrinho.depositar(200.00);
        cofrinho.retirar(150.00);

        //Operações Inválidas (Devem ser rejeitadas)
        cofrinho.retirar(1000.00); //Saldo insuficiente
        cofrinho.depositar(-50.00); //Depósito negativo

        //Tentativa de alterar saldo diretamente (Comentando a linha abaixo para compilar)
        //cofrinho.saldo = 1000.00;  // ERRO DE COMPILAÇÃO: 'saldo has private access in Cofrinho'

        //Exibição do resultado final (Esperado: R$ 550.00)
        cofrinho.mostrarResumo();
    }
}
