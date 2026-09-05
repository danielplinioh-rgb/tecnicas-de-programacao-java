package autoestudo.exercicio4;

public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override 
    public double calcularTaxa() {
        return 0.0;
    }

    @Override 
    public void processar() {
        System.out.println("--- PAGAMENTO VIA PIX ---");
        System.out.printf("Valor Base : R$ %.2f%n", getValor());
        System.out.printf("Taxa       : R$ %.2f%n", calcularTaxa());
        System.out.printf("Total       : R$ %.2f%n", calcularTotal());
    }
}
