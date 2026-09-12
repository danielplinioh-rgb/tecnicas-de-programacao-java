package autoestudo02.exercicio5;

public class GerenteDesafio extends FuncionarioDesafio {
    private double bonus;

    public GerenteDesafio(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }
    
    @Override 
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
}
