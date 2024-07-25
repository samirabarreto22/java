package Stream_API.processamentoDeStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pessoa {
    String id;
    String nome;
    String nacionalidade;
    int idade;

    public Pessoa(){

    }

    public Pessoa(String id, String nome, String nacionalidade, int idade){
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    // getters and setters
    public String getId(){ return this.id; }
    public String getNome(){ return this.nome; }
    public String getNacionalidade(){ return this.nacionalidade; }
    public int getIdade(){ return this.idade; }
    public void setId(String id){ this.id = id; }
    public void setNome(String nome){ this.nome = nome; }
    public void setNacionalidade(String nacionalidade){ this.nacionalidade = nacionalidade; }
    public void setIdade(int idade){ this.idade = idade; }


    public  List<Pessoa> populaPessoas(){
        Pessoa pessoa1 = new Pessoa("p1" , "Matheus Henrique", "Brasil", 18);
        Pessoa pessoa2 = new Pessoa("p2" , "Hernandez Roja", "Mexico", 21);
        Pessoa pessoa3 = new Pessoa("p3" , "Mario Fernandes","Canada", 22);
        Pessoa pessoa4 = new Pessoa("p4" , "Neymar Junior", "Brasil", 22);
        Pessoa pessoa5 = new Pessoa("p4" , "Neymar Junior", "Brasil", 22);   
  

        List<Pessoa> list = new ArrayList<>();

        list.add(pessoa1);
        list.add(pessoa2);
        list.add(pessoa3);
        list.add(pessoa4);
        list.add(pessoa5);

        return list;

    }

    @Override
    public String toString(){
        return this.nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade &&
            id.equals(pessoa.id) &&
            nome.equals(pessoa.nome) &&
            nacionalidade.equals(pessoa.nacionalidade);
}

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, nacionalidade, idade);
    }


    public static void main(String[] args) {

        
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

            //  OPERACOES INTERMEDIARIAS
                // - são operações de processamento de stream
                // - sempre retornam uma nova stream
                // exemplos mais usados:
                // filter()
                // map()
                // sorted()
                // limit()
                // distinct()


        // ==== Cria um IntStream de idades para pessoas com nacionalidade "Brasil"
        /*  IntStream idadeStream = pessoas.stream()
        .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
        .mapToInt(Pessoa::getIdade);
        idadeStream.forEach(System.out::println); */


        // === ordenando os nomes em ordem natural
        /*Stream<Pessoa> nomesOrdenados = pessoas.stream()
        .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
        .sorted(Comparator.comparing(Pessoa::getNome));
        nomesOrdenados.forEach(System.out::println); */

        // ==== buscando nomes que nao se repetem
        // o metodo distinct é baseado no metodo equals
        // ou seja, o metodo equals e o hashCode, que determinam se dados sao iguais tem que serem sobreescritos
        /*Stream<Pessoa> distinct = pessoas.stream().distinct();
        distinct.forEach(System.out::println); */

        // === limitando o retorno dos dados
        /*Stream<Pessoa> limit = pessoas.stream().limit(2);
        limit.forEach(System.out::println);*/

        // OPERACOES TERMINAIS

        // * são operações de retorno dos dados
        // * normalmente identificado pelo tipo de dado de retorno
        // * nunca retorna uma nova stream
        // exemplos:
        // forEach
        // Average
        // collect
        // count
        // allMatch

        // == Loop com forEach
        // pessoas.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        // == media de numeros (reduction) com avarege()
        /*double media = pessoas.stream()
        .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
        .mapToInt(pessoa -> pessoa.getIdade())
        .average()
        .getAsDouble();
        System.out.println(media); */

        // === Convertendo uma stream em coleções com Collect
       /* List<String> pessoasComM = pessoas.stream()
        .map(Pessoa::getNome)
        .filter(nome -> nome.startsWith("M"))
        .collect(Collectors.toList());
        pessoasComM.forEach(System.out::println); */

        // === Contando quantos nomes tem em uma lista com Count()
        long qt = pessoas.stream()
        .map(Pessoa::getNome)
        .filter(pessoa -> pessoa.startsWith("N"))
        .count();

        System.out.println(qt);

        // == verificando se todas as condicoes são verdadeiras ou nao
        boolean todosMexicanos = pessoas.stream()
        .allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));

        System.out.println(todosMexicanos);

        


        

                                


        



    }


}
