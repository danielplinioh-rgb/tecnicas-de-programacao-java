package autoestudo02.exercicio3;

public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public void programar() {
        System.out.println(getNome() + " está codificando em: " + linguagem);
    }
}
