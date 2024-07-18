package exercicios_gpt.ex07;

public class Motor {
    
    int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void ligar(){
        System.out.println("Motor do carro ligado, carro ligado.");
    }
    public void acessar(){
        System.out.println("motor iniciado com potencia: " + potencia);

    }

}
