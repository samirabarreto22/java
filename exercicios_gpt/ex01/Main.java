package exercicios_gpt.ex01;

public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa;

        pessoa = new Pessoa("samira", 21);

        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());

        pessoa.setIdade(22);

        System.out.println(pessoa.getIdade());

        pessoa.aniversario();

        System.out.println(pessoa.getIdade());

        pessoa.aniversario();

        System.out.println(pessoa.getIdade());



    }
}
