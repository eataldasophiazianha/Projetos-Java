public class ContaBancaria {
    // Atributos
    private double saldo;
    // Construtores
    /**
        Construtor que inicializa a conta bancária com saldo 0.
    */
    public ContaBancaria() {
        saldo = 0.0;
    }
    /**
        Construtor que inicializa a conta bancária um saldo inicial passado como
        parâmetro.
        @param saldoInicial valor que deve ser usado como saldo inicial para a conta
        bancária
    */
    public ContaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    // Interface Pública...
    public double acessaSaldo() {
        return saldo;
    }

    public void deposita(double valorDeposito) {
        saldo += valorDeposito;
    }
}
