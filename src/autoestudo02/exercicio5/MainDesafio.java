package autoestudo02.exercicio5;

public class MainDesafio {
    public static void main(String[] args) {
        FuncionarioDesafio f1 = new GerenteDesafio("Alice", 5000.0, 1500.0);
        //Vendedor com 5% de comissão passado como 5.0
        FuncionarioDesafio f2 = new VendedorDesafio("Roberto", 2000.0, 10000.0, 5.0);
    
        f1.mostrarDados(); //R$ 6500.0
        f2.mostrarDados(); // R$ 2500.0
    }
}
