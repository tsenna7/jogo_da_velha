public class Mapa{
    private char [][] mapa;
    
    public Mapa (){
        mapa = new char[3][3];
        limpar();
    }
    public int sortear(int inicio, int fim ) {
        return (int) ((Math.random() * fim) - inicio);
    }
    
    public void limpar(){
        for(int linha = 0; linha < this.mapa.length ; linha ++){
            for(int coluna = 0; coluna < this.mapa[linha].length; coluna++){
                mapa[linha][coluna] = ' ';
            }
        }
    }
    
    public void desenhar(int jogada){
        System.out.println("------------- .. jogada: " + jogada);

        for(int linha = 0; linha < this.mapa.length ; linha ++){
            for(int coluna = 0; coluna < this.mapa[linha].length; coluna++){
                System.out.print("| " + mapa[linha][coluna] + " ");
            }
            System.out.println("|");
            System.out.println("-------------");
        }
    }
    
    public boolean jogar(int l, int c, char jogador){
        if(this.mapa[l][c] == ' '){
            this.mapa[l][c] = jogador;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean verificarGanhador(char jogador){
        if(mapa[0][0] == jogador && mapa[0][1] == jogador && mapa[0][2] == jogador || mapa[0][0] == jogador && mapa[1][0] == jogador && mapa[2][0] == jogador || 
        mapa[0][0] == jogador && mapa[1][1] == jogador && mapa[2][2] == jogador || mapa[0][1] == jogador && mapa[1][1] == jogador && mapa[2][1] == jogador || 
        mapa[0][2] == jogador && mapa[1][2] == jogador && mapa[2][2] == jogador || mapa[1][0] == jogador && mapa[1][1] == jogador && mapa[1][2] == jogador ||
        mapa[2][0] == jogador && mapa[2][1] == jogador && mapa[2][2] == jogador || mapa[0][2] == jogador && mapa[1][1] == jogador && mapa[2][0] == jogador){
            return true;
        }else if(mapa[0][0] != ' ' && mapa[0][1] != ' ' && mapa[0][2] != ' ' && mapa[1][0] != ' ' && mapa[1][1] != ' ' && mapa[1][2] != ' ' &&
        mapa[2][0] != ' ' && mapa[2][1] != ' ' && mapa[2][2] != ' '){
            System.out.println("... EMPATOU!");
            return true;
        }
        return false;
    }
 
}

