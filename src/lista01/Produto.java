package lista01;

public class Produto {
 
    //Inserindo atributos da classe (dados do produto)

    private String nome;
    private double preco;
    private int quantidade;

    //Construtor: usado para inicializar o objeto com dados
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
}

    //Método para calcular o valor total em estoque

    public double calcularValorEstoque() {
        return this.preco * this.quantidade;

    }

    //Método para exibir a ficha do produto
    public void mostrarDados() {
        System.out.println("--------------------------------------------------");
        System.out.printf("Produto:         : %s%n", this.nome);
        System.out.printf("Preço Unitário   : R$ %.2f%n", this.preco);
        System.out.printf("Quantidade       : %d un%n", this.quantidade);
        System.out.printf("Total em Estoque : R$ %.2f%n", calcularValorEstoque()); 
    }

    //Gatters e Setters (seguindo boas práticas)

    public String getNome() { return nome; }
    public void setNome(String nome) {this.nome = nome; }

    public double getPreco() {return preco; }
    public void setPreco(double preco) {this.preco = preco; }

    public int getQuantidade() {return quantidade; }
    public void setQuantidade(int quantidade) {this.quantidade = quantidade; }

}