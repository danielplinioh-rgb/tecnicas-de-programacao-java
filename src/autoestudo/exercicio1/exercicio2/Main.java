package autoestudo.exercicio1.exercicio2;

public class Main {
    public static void main(String[] args) {
        //Instanciando objetos das subclasses
        Videoaula video = new Videoaula("Encapsulamento em Java", 40, "Teams");
        Podcast podcast = new Podcast("Herança em Java", 25 , "Giulia");

        System.out.println("==============================");
        System.out.println("       RESUMO DOS CONTEÚDOS   ");
        System.out.println("==============================");

        //Invocando método herdado de Conteudo
        video.exibirResumo();
        podcast.exibirResumo();

        System.out.println("==============================");
        System.out.println("       AÇÕES ESPECÍFICAS      ");
        System.out.println("==============================");

        //Invocando métodos específicos das subclasses
        video.reproduzirVideo();
        podcast.ouvirPodcast();

        System.out.println("==============================");
    }    
}
