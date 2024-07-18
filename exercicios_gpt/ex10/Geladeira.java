package exercicios_gpt.ex10;

public class Geladeira implements Eletrodomestico{
    
    @Override
    public void ligar(){
        System.out.println("Ligando geladeira");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando geladeira");
    }
}
