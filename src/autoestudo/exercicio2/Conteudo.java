package autoestudo.exercicio1.exercicio2;

public class Conteudo {
    
    public String titulo;
    public int duracaoMinutos;

    public Conteudo(String titulo, int duracaoMinutos) {
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
    }

    //Método herdado por todas as subclasses
    public void exibirResumo() {
        System.out.println("---------------------------");
        System.out.println("Título  : " + this.titulo);
        System.out.println("Duração : " + this.duracaoMinutos + " minutos");
    }
}
    