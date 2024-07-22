package collection.Set;

public class Aluno  implements Comparable<Aluno>{
    private String nome;
    private String curso;
    double nota;

    public Aluno(String nome, String curso, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;

    }

    @Override
    public String toString(){
        return this.nome;

    }

    @Override
    public int compareTo(Aluno aluno){
        return this.nome.compareTo(aluno.getNome());
    }

    @Override
    public boolean equals(Object o){
        Aluno a = (Aluno) o;
        return this.nome.equals(a.getNome());
    }

    @Override
    public int hashCode(){
        return this.nome.hashCode();
    }

    // getters and setters
    public String getNome(){
        return this.nome;
    }
    public double getNota(){
        return this.nota;
    }
    public String getCurso(){
        return this.curso;
    }
    
}
