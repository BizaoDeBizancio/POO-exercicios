package racional;

public class MatrizRacional {
    private static int proximoTamanho = 3;
    private NumeroRacional matriz[][];
    
    public MatrizRacional() {
        matriz = new NumeroRacional [proximoTamanho][proximoTamanho];
        preencheAleatorio();
        proximoTamanho++;
    }
    
    public MatrizRacional(int n, int m){
        this.matriz = new NumeroRacional [n][m];
        preencheDefinido(n, m);
    }
    
    public void mudaValor(int n, int m, NumeroRacional k) throws Exception{
        if(n >= matriz.length || m >= matriz[0].length || n < 0 || m < 0) {
            throw new Exception("Coordenadas inválidas");
        } else {
            this.matriz[n][m] = k;
        }
    }
    
    public void soma(MatrizRacional m) throws Exception {
        if (m.matriz.length != this.matriz.length || m.matriz[0].length != this.matriz[0].length) {
            throw new Exception("Matrizes incompativeis");
        } else {
            for(int i = 0 ; i < this.matriz.length ; i++) {
                for(int j = 0 ; j < this.matriz[0].length ; j++) {
                    this.matriz[i][j].soma(m.matriz[i][j]);
                }
            }
        }
    }
    
    public String imprimir() {
        String text = "";
        for(int i = 0 ; i < this.matriz.length ; i++) {
            for(int j = 0 ; j < this.matriz[0].length ; j++) {
                text += this.matriz[i][j].getString()+"     ";
            }
            text+='\n';
        }
        return text;
    }
    
    public void preencheAleatorio() {
        for(int i = 0 ; i < matriz.length ; i++) {
            for(int j = 0 ; j < matriz[0].length ; j++) {
                this.matriz[i][j] = new NumeroRacional();
            }
        }
    }
    
    private void preencheDefinido(int n, int m){
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                this.matriz[i][j] = new NumeroRacional(0,1);
            }
        }
    }
    
}