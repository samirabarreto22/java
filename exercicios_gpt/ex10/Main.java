package exercicios_gpt.ex10;

public class Main {
    public static void main(String[] args) {
        
        Eletrodomestico geladeira = new Geladeira();
        Eletrodomestico televisao = new Televisao();

        geladeira.ligar();
        geladeira.desligar();
        televisao.ligar();
        televisao.desligar();
    }
}
