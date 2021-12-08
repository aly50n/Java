public class Conta {
    
    private int agencia;
    private int numConta;
    private double saldo;
    private int senha;
    
    public Conta(){}
    public Conta(int agencia, int numConta, double saldo, int senha){
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumConta() {
        return numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getSenha() {
        return senha;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    
}
