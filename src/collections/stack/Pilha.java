package collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        
        Deque<String> livros = new ArrayDeque<>();
        livros.add("Garoto devora universo");
        livros.push("Os sete maridos de Evelyn Hugo");
        livros.push("A Hora da Estrela");
        livros.push("Senhor das moscas");
        livros.forEach(livro -> {System.out.println(livro);});

        System.out.println();
        
        System.out.println(livros.pop());
        System.out.println(livros.pop());
        System.out.println(livros.pop());
        System.out.println(livros.pop());
        // System.out.println(livros.pop()); -> Dá erro
    }
}