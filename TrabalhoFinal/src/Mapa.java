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

        if(jogada == 9 && !verificarGanhador('X') && !verificarGanhador('O')){
            System.out.println("... EMPATOU!");
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
        }
        return false;
    }
 
}

