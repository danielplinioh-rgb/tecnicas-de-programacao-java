package classesabstratas.exercicio1;

public class Main {
    public static void main(String[] args) {
    //Variáveis utilizando o tipo genérico (Funcionário)
    //Os objetos criados na memória são dos tipos concretos (Gerente e Desenvolvedor)
    Funcionario f1 = new Gerente("Marcos", 8000.0);
    Funcionario f2 = new Desenvolvedor("Ana", 5000.0);

    // Execução para o Gerente
    f1.mostrarDados();
    System.out.println("Bônus: R$ " + f1.calcularBonus());

    System.out.println(); //Linha em branco para separar no console

    //Execução para a Desenvolvedora
    f2.mostrarDados();
    System.out.println("Bônus R$: " + f2.calcularBonus());
    
    }
}
