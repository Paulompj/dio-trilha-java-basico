public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private Double Saldo;
    public Conta(int numero, String agencia, String nomeCliente, Double Saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.Saldo = Saldo;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }


    @Override
    public String toString(){
        return "Olá "+getNomeCliente()+
                ", obrigado por criar uma conta em nosso banco, sua agencia é "+getAgencia()+
                ", conta "+getNumero()+
                " e seu saldo "+getSaldo()+
                " ja esta disponivel para saque.";
    }
}
