package collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[]args){
        // TreeSet<>() = Garante a ordem que foram ESCRITOS os objetos
        SortedSet<String> lista = new TreeSet<>();
        //Set<String> lista = new HashSet<String>();

        lista.add("Amanda");
        lista.add("Giovanna");
        lista.add("Katarina");
        
        for(String nomes:   lista){
            System.out.println(nomes);
        }
        System.out.println();

       TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(67);
        numbers.add(87);

        for(int n:numbers){
            System.out.print(n + " ");
        }
    }
}