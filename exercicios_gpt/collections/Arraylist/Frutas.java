package exercicios_gpt.collections.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frutas {
    
    public static void main(String[] args) {
        
        List<String> listaFrutas = new ArrayList<>();

        // adicionando frutas
        listaFrutas.add("Uva");
        listaFrutas.add("Maça");
        listaFrutas.add("Banana");
        listaFrutas.add("Goiaba");
        listaFrutas.add("Manga");

        System.out.println(listaFrutas);

        // removendo um item
        listaFrutas.remove("Banana");

        System.out.println(listaFrutas);

        // colocando em ordem alfabetica
        Collections.sort(listaFrutas);
        System.out.println(listaFrutas);


    }
}
