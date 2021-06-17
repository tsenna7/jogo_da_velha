public class Mapa{
    private char [][] mapa;

    public Mapa (){
        mapa = new char[3][3];
        limpar();
    }

    public int sortear(int inicio, int fim){
        return (int) ((Math.random() * fim) - inicio);
    }

    public void limpar(){
        for(int linha = 0; linha < this.mapa.length ; linha ++){
            for(int coluna = 0; coluna < this.mapa[linha].length; coluna++){
                mapa[linha][coluna] = ' ';
            }
        }
    }

    public boolean jogar(int l, int c, char jogador){
        this.mapa[l][c] = jogador;
        return verficarJogador(jogador);
    }

    public boolean verficarJogador(char jogador){
        return true;
    }
}