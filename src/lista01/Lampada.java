package lista01;

public class Lampada {
    
    private String cor;
    private boolean ligada; //true = ligada , false = desligada

    //Construtor (toda lâmpada começa desligada por padrão)
    public Lampada(String cor) {
        this.cor = cor;
        this.ligada = false;
    }

    //Método para ligar a lâmpada
    public void ligar() {
        this.ligada = true;
        System.out.println("A lâmpada foi ligada.");
    }

    //Método para desligar a lâmpada
    public void desligar() {
        this.ligada = false;
        System.out.println("A lâmpada foi desligada.");
    }

    //Método para exibir o estado atual
    public void mostrarEstado () {
        //Operador ternario simples para exibir texto amigável
        String statusTexto = this.ligada ? "Ligada" : "Desligada";
        
        System.out.println("----------------------------------");
        System.out.printf("Cor da lâmpada : %s%n", this.cor);
        System.out.printf("Estado Atual   : %s%n", statusTexto);
    }

    //Getters e Setters 

    public String getCor() { return cor; }
    public void setCor(String cor) {this.cor = cor; }

    public boolean isLigada() {return ligada; } //Convenção java para boolean: "is" em vez de "get" 
}
