package exercicios_gpt.ex06;

public class ContaBancaria {
    
    private double saldo;
    int numConta;

    public ContaBancaria(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void verSaldo(){
        System.out.println(" O saldo da conta " + numConta + " é: " + saldo);
    }

    

    


}
