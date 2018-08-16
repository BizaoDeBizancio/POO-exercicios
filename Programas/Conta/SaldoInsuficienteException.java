public class SaldoInsuficienteException extends Exception {
    private double saldo, limite;


    public SaldoInsuficienteException(double saldo, double limite) {
        super("Sem saldo");
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getMessage() {
        return "Saldo insuficiente";
    }

    public double getSaldo() {
        return saldo + limite;
    }

}