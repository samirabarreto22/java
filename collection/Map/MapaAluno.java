package collection.Map;

import collection.Set.Aluno;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
    public static void main(String[] args) {
        Map<String, Aluno> mapa = new TreeMap<>();

        Aluno a = new Aluno ("Joao da silva", "linux", 5);
        Aluno b = new Aluno ("antonio souza", "openOffice", 5);
        Aluno c = new Aluno ("lucia ferreira", "internet", 5);
        Aluno d = new Aluno ("benedito silva", "openOffice", 5);

        mapa.put("Joao da silva", a);
        mapa.put("antonio souza", b);
        mapa.put("lucia ferreira", c);
        mapa.put("benedito silva", d);

        System.out.println(mapa);
        System.out.println(mapa.get("lucia ferreira"));

        Collection<Aluno> alunos = mapa.values();
        for (Aluno e : alunos){
            System.out.println(e);
        }
        

    }
    
}
