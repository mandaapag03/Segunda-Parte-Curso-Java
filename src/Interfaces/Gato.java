package Interfaces;

public class Gato implements Mamiferos{

    @Override
    public void tomarLeite() {System.out.println("Glub Glub");}

    public String miar(){
        String miado = "Miau Miau";
        return miado;
    }


}
