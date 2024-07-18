package exercicios_gpt.ex07;

public class Carro {
    
    public Motor motor;

    public Carro() {
        this.motor = new Motor(100);
    }

    public Carro(int novaPotencia){
        this.motor = new Motor(novaPotencia);
    }

    public void ligarCarro(){
        motor.ligar();
    }

    public void acessarMotor(){
        motor.acessar();
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
