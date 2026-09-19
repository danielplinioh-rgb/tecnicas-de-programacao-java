package classesabstratas.exercicio1;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    //Implementando obrigatoriamente o contrato abstrato
    @Override 
    public double calcularBonus() {
        return getSalario() * 0.10; //10% do salário
    }
}
