package autoestudo02.exercicio3;

public class MainHierarquia {
    public static void main(String[] args) {
        Gerente g = new Gerente("Giulia", 8000.0, "T.I");
        Desenvolvedor dev = new Desenvolvedor("Daniel", 5000.0, "Java"); 
        
        g.mostrarDados(); //Método herdado
        g.realizarReuniao(); //Método específico

        dev.mostrarDados(); //Método herdado
        dev.programar(); //Método específico
    }
}
