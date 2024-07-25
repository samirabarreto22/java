package exercicios_gpt.collections.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoPalavras {
    
    public static void main(String[] args) {
        
        Set<String> palavras = new LinkedHashSet<>();

        String frase = "este é um conjunto de palavras";

        for (String palavra : frase.split(" ")){
            palavras.add(palavra);
        }

        System.out.println(palavras);

        palavras.add("samira");
        palavras.add("ana");

        System.out.println(palavras);

        palavras.remove("ana");

        System.out.println(palavras);




    }
}
