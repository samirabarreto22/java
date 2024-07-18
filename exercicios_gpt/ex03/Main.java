package exercicios_gpt.ex03;

public class Main {
    public static void main(String[] args) {
        
        Carro carro = new Carro("fiat", "s100", 2);

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getNumPortas());
    }
}
