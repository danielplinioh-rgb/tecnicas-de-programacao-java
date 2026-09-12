package autoestudo02.exercicio5;

public class VendedorDesafio extends FuncionarioDesafio {
    private double totalVendas;
    private double percentualComissao;

    public VendedorDesafio(String nome, double salarioBase, double totalVendas, double percentualComissao) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }
    
    @Override 
    public double calcularSalario() {
        return getSalarioBase() + (totalVendas * (percentualComissao / 100.00));
    }
}
