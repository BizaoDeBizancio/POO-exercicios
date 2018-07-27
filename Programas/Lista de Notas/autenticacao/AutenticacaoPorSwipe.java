package autenticacao;

import java.util.Scanner;

public class AutenticacaoPorSwipe implements IMetodoAutenticacao{
    private UsuarioAutenticado usuario;
    
    public AutenticacaoPorSwipe(){
        int codigo = recebeCodigo();
        String nome = recebeNome();
        this.usuario = new UsuarioAutenticado(codigo, nome);        
    }
    
    @Override
    public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException {
        int padrao = recebePadrao();
        if(padrao == 112233) {
            return this.usuario;
        } else {
            throw new UsuarioNaoAutenticadoException();
        }
        
    }
    
    private String recebeNome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        return sc.next();
    }
    
    private int recebeCodigo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo:");
        return sc.nextInt();
    }
    
    private int recebePadrao(){
        printTela();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sequencia de swipe (xy):");
        return sc.nextInt();
    }
    
    private void printTela(){
        System.out.println("     1   2   3");
        System.out.println("1    o   o   o");
        System.out.println("2    o   o   o");
        System.out.println("3    o   o   o");
    }
}