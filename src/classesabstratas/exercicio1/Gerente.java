package classesabstratas.exercicio1;

public class Gerente extends Funcionario {

    // O construtor repassa os dados para o construtor de superclasse abstrata
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    //Implementando obrigatoriamente o contrato abstrato
    @Override 
    public double calcularBonus() {
        return getSalario() * 0.20; //20% do salário
    }
}
