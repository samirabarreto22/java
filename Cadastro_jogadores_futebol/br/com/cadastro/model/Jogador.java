package Cadastro_jogadores_futebol.br.com.cadastro.model;
// UML
/*
Jogador
 - Nome:String
 - Posição: String
 - Idade: int
 - TimeAtual: String
 - GoalsMarcados: int
 + toString() : String
 */
public class Jogador {

    String nome;
    String posicao;
    int idade;
    String timeAtual;
    int goalsMarcados;

    // getters and setters
    public String getNome(){ return this.nome; }
    public String getPosicao(){ return this.posicao; }
    public int getIdade(){ return this.idade; }
    public String getTimeAtual(){ return this.timeAtual; }
    public int  getGoalsMarcados(){ return this.goalsMarcados; }
    public void setNome(String nome){ this.nome = nome; }
    public void setPosicao(String posicao){ this.posicao = posicao; }
    public void setIdade(int idade){ this.idade = idade; }
    public void setTimeAtual(String timeAtual){ this.timeAtual = timeAtual; }
    public void setGoalsMarcados(int goalsMarcados){ this.goalsMarcados = goalsMarcados; }


    @Override
    public String toString(){
        return this.nome + "" + this.posicao + "" + this.getTimeAtual();
    }
    
}
