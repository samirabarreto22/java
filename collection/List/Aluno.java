package collection.List;

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
        return "Nome: " + this.nome + " | " + "Curso: " + this.curso + " | " + "Nota: "  + this.nota;

    }

    @Override
    public int compareTo(Aluno aluno){
        return this.nome.compareTo(aluno.getNome());
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
