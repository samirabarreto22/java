package projetos.banco_odd_v01;

public class ContaCorrente extends ContaBancaria{
    
    double limiteChequeEspecial;

    public ContaCorrente(int numeroConta, String dataAbertura, double saldo, double limiteChequeEspecial) {
        super(numeroConta, dataAbertura, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor){

        double saldoDisponivel = saldo + limiteChequeEspecial;

        if (valor <= saldoDisponivel){
            this.saldo -= valor;
            if (this.saldo < 0) {
                double valorExcedente = Math.abs(this.saldo);
                limiteChequeEspecial -= valorExcedente;
                this.saldo = 0;
            }
        } else {
            System.out.println("Saldo insuficiente.");
        }
            
    }

    @Override
    public void informacoesConta(){
        System.out.println("=====================================================");
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite chque especial: " + this.limiteChequeEspecial);
        System.out.println("Data de Abertura: " + this.dataAbertura);
        System.out.println("Conta ativa? " + this.saldo);
        System.out.println("=====================================================");
    }
    
}
