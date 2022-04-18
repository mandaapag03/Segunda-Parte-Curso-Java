package src.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[]args){

        Queue <String> fila = new LinkedList<>();

        //add elementos (.add X .offer)
        fila.add("Amanda");
        fila.offer("Andrew");
        fila.add("Adrian");
        fila.offer("Lauren");
        fila.add("Gine");
        fila.offer("Pérola");

        //obtem o próximo elemento da fila (Sem remover) (peek X element)
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());
        System.out.println();

        //obtem o próximo elemento da fila (Removendo em seguida) (poll X remove)
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println();
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        //Também tem os métodos já vistos como:
        // fila.addAll(c);
        // fila.contains(o);
        // fila.size();
        // fila.clear();
        // fila.isEmpty ... entre outros
    }
}