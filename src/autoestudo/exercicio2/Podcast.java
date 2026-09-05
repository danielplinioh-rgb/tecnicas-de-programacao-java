package autoestudo.exercicio1.exercicio2;

public class Podcast extends Conteudo {
    public String apresentador;

    public Podcast(String titulo, int duracaoMinutos, String apresentador) {
        super(titulo, duracaoMinutos);
        this.apresentador = apresentador;
    }

    //Comportamento exclusivo de Podcast
    public void ouvirPodcast() {
        System.out.println("Podcast apresentado por: " + this.apresentador);

    }
        
}
    
