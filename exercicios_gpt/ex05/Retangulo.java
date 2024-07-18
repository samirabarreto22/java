package exercicios_gpt.ex05;

public class Retangulo implements Forma{
    
    double comprimento;
    double largura;


    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    
    @Override
    public double calcularArea(){
        return comprimento * largura;
    }
}
