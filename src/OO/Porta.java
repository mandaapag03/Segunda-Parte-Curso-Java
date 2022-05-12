package src.OO;

public class Porta {
    boolean fechado = true;
    boolean abrir (){
        fechado = false;
           return false;
    }
    boolean fechar(){
        fechado = true;
        return true;
    }
}
