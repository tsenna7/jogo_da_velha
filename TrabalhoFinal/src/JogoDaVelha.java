import java.util.Scanner;

public class JogoDaVelha {

    private JogoDaVelha(){
        Scanner teclado = new Scanner(System.in);
        Mapa JogoMapa = new Mapa();
        PC JogoPC = new PC(JogoMapa);
        

        jogar(teclado);
    }

    private void jogar(Scanner teclado){
        
    }

    public static void main(String[] args) throws Exception {
        new JogoDaVelha();
    }
}
