package collection.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListaAluno {
    
    public static void main(String[] args) {
        
        //TreeSet - menor desempenho
        Set<Aluno> conjunto = new HashSet<>();

        Aluno a = new Aluno("Joao da silva", "linux basico", 5);
        Aluno b = new Aluno("Antonio souza", "OpenOffice", 6);
        Aluno c = new Aluno("Lucia ferreira", "Internet", 8);
        Aluno d = new Aluno("Lucia ferreira", "Internet", 8);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
    
        System.out.println(conjunto);
        

        
    }
}
