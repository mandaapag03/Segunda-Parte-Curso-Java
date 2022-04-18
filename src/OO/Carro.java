package OO;

public class Carro {
    /*
    A ideia expressada nesse tipo de utilização das classes é que uma classe (carro) pode ter uma outra classe(motor) como atributo.
     */
    Motor motor = new Motor();

    void acelerar(){
        motor.fatorDeInjecao += 0.4;
    }
    void frear(){
        motor.fatorDeInjecao -= 0.4;
    }
    void desligar(){
        motor.ligado = false ;
    }
    void ligar(){
        motor.ligado = true;
    }
    boolean estaLigado(){
        return motor.ligado;
    }

}
