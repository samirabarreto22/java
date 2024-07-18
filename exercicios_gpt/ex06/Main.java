package exercicios_gpt.ex06;

public class Main {
    
    public static void main(String[] args) {
        
        ContaBancaria conta = new  ContaBancaria(001);

        conta.depositar(200);

        conta.verSaldo();

        conta.depositar(400);

        conta.verSaldo();

        conta.sacar(50);

        conta.verSaldo();

        conta.sacar(50);

        conta.verSaldo();

    }
}
