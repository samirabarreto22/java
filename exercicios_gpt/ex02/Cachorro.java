package exercicios_gpt.ex02;

public class Cachorro {
    
    String nome;
    String raca;

    public Cachorro(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }


}
