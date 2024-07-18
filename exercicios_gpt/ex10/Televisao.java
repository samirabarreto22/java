package exercicios_gpt.ex10;

public class Televisao implements Eletrodomestico{
    
    @Override
    public void ligar(){
        System.out.println("Ligando televisao");
    }

    @Override
    public void desligar(){
        System.out.println("Desligando geladeira");
    }
}
