package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) {
        HashSet name = new HashSet();

        //Adicionar elementos na collection:

        name.add(1.3); // --> converteu sozinho de primitivo para wrapper
        name.add(true);
        name.add('x');
        name.add(9);
        name.add("String");

        // Verificar tamanho da collection:
        System.out.println(name.size());
        
        name.add(9); //--> Aqui ele ignorou,pois está repetido
        System.out.println(name.size());

        // Apagar elemento da collection:
        System.out.println(name.remove(true)); //--> se remover é True
        System.out.println(name.remove('v')); //--> se não remover é False
        System.out.println(name.size());

        // Verifica existência do elemento - contains():
        System.out.println(name.contains(true));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums + " --> nums");
        System.out.println(name + " --> name");
        
        // Unir conjuntos:
        name.addAll(nums);
        System.out.println(name + " --> nums + name");

        // Interseção de conjuntos: (o que eles tem em comum)
        name.retainAll(nums);
        System.out.println(name);

        // Limpar conjunto: 
        name.clear();
        System.out.println(name);
    }
}