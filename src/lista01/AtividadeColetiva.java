package lista01;

public class AtividadeColetiva {
    public static void main(String[] args) {
        
        Cachorro meuCachorro = new Cachorro("Rex", 3);

        System.out.println("=================================");
        System.out.println("        AÇÃO DO CACHORRO         ");
        System.out.println("=================================");

        //Chamando o méotodo latir
        meuCachorro.latir();

        System.out.println("=================================");
    }
}
