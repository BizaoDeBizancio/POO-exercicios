package racional;

public class NumeroRacional {
    private int numerador, denominador;
    
    
    public NumeroRacional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }
    
    public NumeroRacional() {
        this.numerador = (int)(Math.random()*10);
        this.denominador = (int)(Math.random()*9)+1;
        simplificar();
    }
    
    private void simplificar() {
        int mdc = findMDC(this.denominador, this.numerador);
        if(mdc != 0) {
            this.numerador   /= mdc;
            this.denominador /= mdc;
        }
        
    }
    
    public void soma(NumeroRacional b) {
        this.numerador    = this.numerador*b.denominador+b.numerador*this.denominador;
        this.denominador *= b.denominador;
        simplificar();
    }
    
    private int findMDC(int a, int b) {
        int menor = a < b ? a : b;
        int mdc = 0;
        
        for (int i = menor; i > 1 && mdc == 0; i--) {
            if(this.denominador % i == 0 && this.numerador % i == 0) {
                mdc = i;
            }
        }
        
        return mdc;
    }
    
    public String getString(){
        return ""+this.numerador+"/"+this.denominador;
    }
}
