package lista01;

public class Exercicio21 {
    public static void main(String[] args) {
        //Instanciando (criando) dois objetos do tipo Produto
        Produto produto1 = new Produto("Notebook", 3500.00, 5);
        Produto produto2 = new Produto("Mouse sem fio", 80.00, 20);

        System.out.println("=================================================");
        System.out.println("                 DADOS DO PRODUTO                ");
        System.out.println("=================================================");

        //Chamando o método mostrarDados()  de cada objeto
        produto1.mostrarDados();
        produto2.mostrarDados();

        System.out.println("=================================================");
    }
}
