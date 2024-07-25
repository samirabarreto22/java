package exercicios_gpt.collections.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {
    public static void main(String[] args) {
        
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(9);
        conjunto.add(10);

        System.out.println(conjunto);

        int num = 10;

        if(conjunto.contains(num)){
            System.out.println("contains");
        }else{
            System.out.println("nao containes");
        }


        for (Integer n: conjunto){
            if (num == n){
                System.out.println("tem");
            }
        }

        for (Integer n : conjunto){
            System.out.println(n);
        }
    }
}
