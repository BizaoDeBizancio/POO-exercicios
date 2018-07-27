import racional.*;

public class Principal {
    public static void main(String[] args) {
        MatrizRacional M1 = new MatrizRacional();
        MatrizRacional M2 = new MatrizRacional(3,3);
        M2.preencheAleatorio();

        System.out.println("M1");
        System.out.println(M1.imprimir());
        System.out.println("M2");
        System.out.println(M2.imprimir());
        
        try{
        M1.soma(M2);
        System.out.println("M1+M2");
        System.out.println(M1.imprimir());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        MatrizRacional M3 = new MatrizRacional();
        MatrizRacional M4 = new MatrizRacional();
        System.out.println("M3");
        System.out.println(M3.imprimir());
        System.out.println("M4");
        System.out.println(M4.imprimir());
        
        
        
    }
    

}