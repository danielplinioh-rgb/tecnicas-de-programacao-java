package autoestudo02.exercicio1;

public class MainProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 3500.00, 10 );

        p.adicionarEstoque(5); //Válido
        p.retirarEstoque(20); //Inválido (maior que o estoque)
        p.alterarPreco(-500); //Inválido (preço negativo)

        p.mostrarDados();
    }
}
