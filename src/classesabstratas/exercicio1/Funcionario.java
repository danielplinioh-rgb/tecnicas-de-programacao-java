package classesabstratas.exercicio1;

public abstract class Funcionario {
    //Atributos privados, garantindo encapsulamento
    private  String nome;
    private double salario;

    //Construtor executando ao instanciar subclasse concreta
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //Getters para fazer consultas controladas dos dados privados
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    //Método concreto (comportamento partilhado e idêntico para todos)
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
    }

    //Método abstrato - NÃO possui corpo ({}), apenas o contrato, (assinatura)
    public abstract double calcularBonus();
}


