package projetos.banco_odd_v01;

public class ContaBancaria {
    
    int numeroConta;
    String dataAbertura;
    boolean status = false;
    double saldo;

    public ContaBancaria(int numeroConta, String dataAbertura, double saldo ){
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    // getters and setters
    public int getNumeroConta(){ return numeroConta; }
    public String getDataAbertura(){ return dataAbertura; }
    public boolean getStatus(){ return status; }
    public double getSaldo(){ return saldo; }
    public void setNumeroConta(int numeroConta){ this.numeroConta = numeroConta; }
    public void setDataAbertura(String dataAbertura){ this.dataAbertura = dataAbertura; }
    public void setStatus(boolean status){ this.status = status; }
    public void setSaldo(double saldo){ this.saldo = saldo; }


    public void ativarConta(){
        this.status = true;
        System.out.println("Conta Ativa");
    }
    public void verificarSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Novo Saldo: " + this.saldo);
    }
    public void sacar(double valor){
        this.saldo -= valor;
        System.out.println("Novo Saldo: " + this.saldo);
    }

    public void informacoesConta(){
        System.out.println("=====================================================");
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Data de Abertura: " + this.dataAbertura);
        System.out.println("Conta ativa? " + this.saldo);
        System.out.println("=====================================================");
    }
}
