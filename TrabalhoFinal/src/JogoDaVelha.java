import java.util.Scanner;

public class JogoDaVelha{
    public PC jogoPC;
    public Mapa jogoMapa;
    public Jogador jogoJogador;
    
    private JogoDaVelha() {
        this.jogoMapa = new Mapa();
        this.jogoPC = new PC(this.jogoMapa);  
        this.jogoJogador = new Jogador(this.jogoMapa);
        Scanner teclado = new Scanner(System.in);
        jogar(teclado);
        
        System.out.println("Deseja jogar novamente (s/n)?");
        String jogarNovamente = teclado.next();
        
        while(jogarNovamente.equalsIgnoreCase("s")){
            jogar(teclado);
            System.out.println("Deseja jogar novamente (s/n)?");
            jogarNovamente = teclado.next();
        }

        System.out.println("--- FIM ---");
    }
    
    private void jogar(Scanner teclado){
        jogoMapa.limpar();
        jogoMapa.desenhar(0);
        int jogada = 0;
        
        int quemJoga = 0;
        quemJoga = jogoMapa.sortear(0, 2);
        
        while(!jogoMapa.verificarGanhador('X') && !jogoMapa.verificarGanhador('O')){
            switch(quemJoga){
                case 0:
                    jogoJogador.jogar(teclado);
                    quemJoga = 1;
                    break;
                case 1:
                    jogoPC.jogar();
                    quemJoga = 0;
                    break;
            }
       

        jogada++;
        jogoMapa.desenhar(jogada);
    
        }
    }
    
    public static void main(String[] args) throws Exception{
        new JogoDaVelha();
    }
}