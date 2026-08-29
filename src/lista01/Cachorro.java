package lista01;

public class Cachorro {
    
    private String nome;
    private int idade;

    //Construtor para inicializar os atributos
    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Método para executar a ação de latir
    public void latir() {
        System.out.printf("%s (%d anos) diz: Au au! %n", this.nome, this.idade);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
}
