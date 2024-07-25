package exercicios_gpt.collections.TreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Inteiros {
    
    public static void main(String[] args) {
        
        Set<Integer> numeros = new TreeSet<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        Integer minNumber = null;
        Integer maxNumber = null;

        for (Integer number : numeros){
            if (minNumber == null || number < minNumber){
                minNumber = number;
            }

            if (maxNumber == null || number > maxNumber){
                maxNumber = number;
            }
        }

        System.out.println(minNumber);
        System.out.println(maxNumber);

        // ordem descrecente 
        List<Integer> sortedList = new ArrayList<>(numeros);

        Collections.sort(sortedList, Collections.reverseOrder());

        System.out.println(numeros);
        System.out.println(sortedList);
        
    }
}
