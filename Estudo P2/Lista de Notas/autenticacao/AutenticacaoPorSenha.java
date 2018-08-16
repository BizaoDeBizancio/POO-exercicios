package autenticacao;

import java.util.Scanner;

public class AutenticacaoPorSenha implements IMetodoAutenticacao{
    private UsuarioAutenticado usuario;
    
    public AutenticacaoPorSenha(){
        int codigo = recebeCodigo();
        String nome = recebeNome();
        this.usuario = new UsuarioAutenticado(codigo, nome);        
    }
    
    @Override
    public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException {
        int senha = recebeSenha();
        if(senha == 1234) {
            return this.usuario;
        } else {
            throw new UsuarioNaoAutenticadoException();
        }
        
    }
    
    private String recebeNome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome");
        return sc.next();
    }
    
    private int recebeCodigo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo");
        return sc.nextInt();
    }
    
    private int recebeSenha(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha");
        return sc.nextInt();
    }
}