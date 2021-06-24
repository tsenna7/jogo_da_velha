public class PC{
    private char letra;
    private Mapa mapa;

    public PC(Mapa mapa){
        this.mapa = mapa;
        letra = 'O';
    }
    boolean jogar(){
        boolean repetir = true;
        int linha = 0;
        int coluna = 0;

        while(repetir){
        
            linha = this.mapa.sortear(0, 3);
            coluna = this.mapa.sortear(0, 3);
            
            if(mapa.jogar(linha, coluna, letra)){
                repetir = false;
                System.out.println("PC[" + linha + ","+ coluna+ "]");
            }

           
        }
        if(mapa.verificarGanhador('O')){
            System.out.println("... PC GANHOU!");
            return false;
        }
        return true;
    }

}

