package equalshashcode;

public class equals {
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();
        u1.name = "Carolina Silva";
        u1.email = "carolina.silva1234@gmail.com";
        
        Usuario u2 = new Usuario();
        u2.name = "Carolina Silva";
        u2.email = "carolina.silva1234@gmail.com";

        System.out.println(u1.hashCode());

        System.out.println(u1 == u2); //-->Falso (Compara endereço)
        System.out.println(u1.equals(u2)); //--> Falso (Compara endereço) *SEM IMPLEMENTO EQUALS
        
        System.out.println(u1.equals(u2));// *COM IMPLEMENTO EQUALS
    }
}