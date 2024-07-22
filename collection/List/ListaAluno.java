package collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListaAluno {
    
    public static void main(String[] args) {
        
        //LinkedList
        List<Aluno> lista = new ArrayList<>();
        ComparaAluno ca = new ComparaAluno();

        Aluno a = new Aluno("Joao da silva", "linux basico", 5);
        Aluno b = new Aluno("Antonio souza", "OpenOffice", 6);
        Aluno c = new Aluno("Lucia ferreira", "Internet", 8);

        lista.add(a);
        lista.add(b);
        lista.add(c);
    
        // Collections.sort(lista);
        Collections.sort(lista, ca);
        System.out.println(lista);

        Aluno aluno;
        Iterator<Aluno> busca = lista.iterator();
        while (busca.hasNext()){
            aluno = busca.next();
            System.out.println(aluno.getNome());
        }
        

        
    }
}
