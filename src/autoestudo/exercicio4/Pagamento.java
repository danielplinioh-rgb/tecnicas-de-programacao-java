package autoestudo.exercicio4;

public class Pagamento {
    //Encapsulamento: Atributo privado
    private double valor;

    //Construtor com validação
    public Pagamento(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            this.valor = 0;
            System.out.println("Valor inválido! Inicializando com 0.");
        }
    }

    public double getValor() {
        return valor;
    }

    //Método a ser sobrescrito pelas subclasses (Polimorfismo)  
    public double calcularTaxa() {
        return 0;
    }

    //O total recusa a taxa calculando dinamicamente pela subclasse
    public double calcularTotal() {
        return this.valor + calcularTaxa();
    }
    
    public void processar() {
        System.out.printf("Total do pagamento: R$ %2.f%n", calcularTotal());
    }
}
