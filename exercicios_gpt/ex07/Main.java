package exercicios_gpt.ex07;

public class Main {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.ligarCarro();
        carro.acessarMotor();

        Carro carro2 = new Carro(300);

        carro2.acessarMotor();
    }
}
