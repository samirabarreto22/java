package exercicios_gpt.ex02;

public class Main {
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("dudu", "viralata");

        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getRaca());

        cachorro.setNome("lulu");
        cachorro.setRaca("pincher");

        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getRaca());



    }
}
