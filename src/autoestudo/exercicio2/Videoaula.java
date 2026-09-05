package autoestudo.exercicio2;

public class Videoaula extends Conteudo {
    public String plataforma;

    //Construtor
    public Videoaula(String titulo, int duracaoMinutos, String plataforma) {
        //'super' chama o construtor da superclasse (Conteudo)
        super(titulo, duracaoMinutos);
        this.plataforma = plataforma;
    }

    //Comportamento exclusivo de Videoaula
    public void reproduzirVideo() {
        System.out.println("Reproduzindo na plataforma " + this.plataforma);
    }
}
