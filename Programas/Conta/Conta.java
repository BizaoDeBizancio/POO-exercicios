public class Conta {
    private String nome;
    private double saldo = 0;
    private double limite = 0;

    public Conta(String nome) {
        this.nome = nome;
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(double saque) throws SaldoInsuficienteException {
        if(saque > saldo + limite) {
            throw new SaldoInsuficienteException(saldo, limite);
        } else {
            this.saldo -= saque;
        }
    }

    @Override
    public String toString() {
        return "Nome: "+nome+" ; Saldo: "+saldo+" ; Limite: "+limite;        
    }

}