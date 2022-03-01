package collections.list;

import java.util.ArrayList;
import java.util.List;

public class lista {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        // Instanciar objeto da lista
        User u1 = new User("Gustavo");
        list.add(u1);
        User u2 = new User("Paulo");
        list.add(u2);
        list.add(new User("Amanda"));
        list.add(new User("Gabriela"));
        list.add(new User("Larissa"));
        list.add(new User("Júlio"));
        list.add(new User("Caio"));

        for(User u : list){
            System.out.println(u.nome);
        }

        // Acessar pelo índex:
        System.out.println("\nAcessar pelo índex:");
        System.out.println(list.get(2).nome);
        System.out.println(list.get(4)); // Com método toString na Classe User (toString implícito)
        System.out.println(list.get(2).toString()); // (toString explícito)
        System.out.println();
        for(User x: list){
            System.out.println(x); // (toString implícito)
        }
        
        // Remover item da lista:
        System.out.println("\nRemover item da lista:");
        System.out.println(list.remove(new User("Amanda")));
        System.out.println(list.remove(3));
        System.out.println();
        for(User z: list){
            System.out.println(z); // (toString implícito)
        }
    }
}