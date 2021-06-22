import java.util.Scanner;
public class Jogador{
    private char letra;
    private Mapa mapa;

    public Jogador(Mapa mapa){
        this.mapa = mapa;
        letra = 'X';
    }

    boolean jogar(Scanner teclado){
        System.out.println("Jogador ..");
        System.out.print("    linha: ");
        int linha = teclado.nextInt();
        System.out.print("    coluna: ");
        int coluna = teclado.nextInt();

        while(linha > 2 || linha < 0 || coluna > 2 || coluna < 0) {
            System.out.println("Jogador ..");
            System.out.print("    linha: ");
            linha = teclado.nextInt();
            System.out.print("    coluna: ");
            coluna = teclado.nextInt();
        }

        while(!mapa.jogar(linha, coluna, 'X')){
            System.out.println("Posição inválida!");
            System.out.println("Jogador ..");
            System.out.print("    linha: ");
            linha = teclado.nextInt();
            System.out.print("    coluna: ");
            coluna = teclado.nextInt();
        }

        if(mapa.verificarGanhador(letra)) {
            System.out.println("... Jogador GANHOU!");
            return false;
        }

        return true;
    }

}

