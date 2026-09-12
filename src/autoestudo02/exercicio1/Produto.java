package autoestudo02.exercicio1;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    //Construtor para garantir que o objeto já nasça com um estado válido
    public Produto(String nome, double preco, int quantidade) { 
        this.nome = nome; //'this' diferencia o atributo do parâmetro
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Getters para permitir apenas a leitura (consulta) dos dados
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return  quantidade; }

    //Métodos de domínio para proteção das regras de negócio
    public void alterarPreco(double novoPreco) {
        if (novoPreco >= 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo.");
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }

    public void retirarEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Erro: Quantidade inválida ou estoque insuficiente.");
        }
    }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    public void mostrarDados() {
        System.out.println("Produto: " + nome + " | Preço: R$" + preco + " | Estoque: " + quantidade);
    }
}

