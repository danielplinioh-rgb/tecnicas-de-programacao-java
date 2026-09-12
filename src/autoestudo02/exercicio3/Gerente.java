package autoestudo02.exercicio3;

public class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario); //Enviando os dados ao construtor da superclasse
        this.setor = setor;
    }

    public void realizarReuniao() {
        System.out.println(getNome() + " está condunzindo a reunião do setor " + setor);
    }
}
