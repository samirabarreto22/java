package exercicios_gpt.ex12;

public class Biblioteca {
    
    public class Livro {

        String titulo;
        String autor;

        public Livro(String titulo, String autor){
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo(){
            return titulo;
        }
        public String getAutor(){
            return autor;
        }
        public void setTitulo(String titulo){
            this.titulo = titulo;
        }
        public void setAutor(String autor){
            this.autor = autor;
        }
    }

    
}
