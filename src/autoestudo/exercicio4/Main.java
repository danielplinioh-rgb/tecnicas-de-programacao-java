package autoestudo.exercicio4;

public class Main {
    public static void main(String[] args) {
        //Declaração usando o tipo genérico Pagamento
        Pagamento PagamentoPix = new PagamentoPix(100.00);
        Pagamento PagamentoCartao = new PagamentoCartao(100.00, 3);

        System.out.println("================================");
        System.out.println("      PROCESSANDO PAGAMENTOS    ");
        System.out.println("================================");

        //O Java descobre em tempo de execução qual processar() chamar
        PagamentoPix.processar();
        System.out.println();
        PagamentoCartao.processar();

        System.out.println("=================================");
    }
}
