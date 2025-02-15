package exercicios_gpt.ex05;

public class Circulo implements Forma{

    double raio;

    public Circulo(double  raio){
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
       return Math.PI * Math.pow(raio, 2);
    }
    
}
