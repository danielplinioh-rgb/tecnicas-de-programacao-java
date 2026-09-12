package autoestudo02.exercicio5;

public class FuncionarioDesafio {
    private String nome;
    private double salarioBase;


    public FuncionarioDesafio(String nome, double salarioBase) {
        this.nome = nome;
        //Extensão: impedir salário-base negativo.
        this.salarioBase = salarioBase > 0 ? salarioBase : 0;
    }

    public String getNome() { return nome; }
    public double getSalarioBase() { return salarioBase; }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarDados() {
        System.out.println("Funcionário: " + nome + " | Salário Final: R$" + calcularSalario());
    }
}
