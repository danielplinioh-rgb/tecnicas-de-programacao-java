package autoestudo.exercicio4;

public class PagamentoCartao extends Pagamento {
    private int parcelas;

    public PagamentoCartao(double valor, int parcelas) {
        super(valor);
        this.parcelas = parcelas;
    }

    public int getParcelas() {
        return parcelas;
    }

    @Override 
    public double calcularTaxa() {
        return getValor() * 0.03; //Taxa de 3%
    }

    @Override 
    public void processar() {
        System.out.println("---PAGAMENTO VIA CARTÃO ---");
        System.out.printf("Valor Base : R$ %.2f (%d parcelas)%n", getValor(), this.parcelas);
        System.out.printf("Taxa(3%%)       : R$ %.2f%n", calcularTaxa());
        System.out.printf("Total       : R$ %.2f%n", calcularTotal());
    }
}
