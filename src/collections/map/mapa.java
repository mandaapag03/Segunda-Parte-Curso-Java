package src.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mapa {
    public static void main(String[] args) {

        Map<Integer, String> user = new HashMap<>();

        // put: Adiciona quando não existe e se existe ele substitui
        user.put(548, "Salgados fulana de tal");
        user.put(789, "Cantinho do açaí");
        user.put(865, "FD do Brasil");
        user.put(865, "Milênio");
        user.put(866, "Milênio");
        // chaves iguais, substitui elemento e valores iguais, não substitui. Pois a
        // chave não aceita repetição e o valor aceita repetição.

        System.out.println(user.size());
        // keySet() : Imprime todas as chaves
        System.out.println(user.keySet());
        // values() : Imprime todos os valores
        System.out.println(user.values());
        // entrySet() : Imprime chaves e valores
        System.out.println(user.entrySet());

        // containsKey() e containsValues() : Se existe a chave ou valor - boolean
        System.out.println(user.containsKey(866));
        System.out.println(user.containsValue("FD do Brasil"));

        // get() : pesquisar valor por sua chave
        System.out.println(user.get(865));

        // COMO PERCORRER UM MAP??

        // 1° Só a chave:
        for (Integer cnpj : user.keySet()) {
            System.out.println(cnpj);
        }

        // 2° Só valor:
        for (String nome : user.values()) {
            System.out.println(nome);
        }

        // 3° Chave e valor juntos:
        for (Entry<Integer, String> cadastro : user.entrySet()) {
            System.out.print(cadastro.getKey() + "==> ");
            System.out.println(cadastro.getValue());
        }

    }

}