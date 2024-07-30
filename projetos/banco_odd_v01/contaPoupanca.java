package projetos.banco_odd_v01;

public class ContaPoupanca extends ContaBancaria{
    
    double taxaJuros;

    public ContaPoupanca(int numeroConta, String dataAbertura, double saldo, double taxaJuros) {
        super(numeroConta, dataAbertura, saldo);
        this.taxaJuros = taxaJuros;
    }


    public double calcularRendimentos(){
        double rendimentos = saldo * (taxaJuros / 100);
        return rendimentos;
    }
}
