package exercicios_gpt.ex11;

public class SmartDevice implements Conectavel, Desligavel{

    @Override
    public void conectar(){
        System.out.println("Smart conectada");
    }

    @Override
    public void desligar(){
        System.out.println("Smart desligada");
    }


}
