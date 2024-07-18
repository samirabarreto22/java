package exercicios_gpt.ex05;

public class Main {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(3.4);
        Retangulo retangulo = new Retangulo(4.4, 5.7);
        double area = circulo.calcularArea();
        double area2 = retangulo.calcularArea();
        

        System.out.println(area);
        System.out.println(area2);

    }
    
}
