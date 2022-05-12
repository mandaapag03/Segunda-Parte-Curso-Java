package src.OO;

public class Carro {
    /*
    A ideia expressada nesse tipo de utilização das classes é que uma classe (carro) pode ter uma outra classe(motor) como atributo.
     */
    Motor motor = new Motor();
    Porta frenteEsquerda = new Porta();
    Porta frenteDireita = new Porta();
    Porta trasEsquerda = new Porta();
    Porta trasDireita = new Porta();

    void acelerar(){
        motor.fatorDeInjecao += 0.4;
    }
    void frear(){
        motor.fatorDeInjecao -= 0.4;
    }
    void desligar(){
        motor.ligado = false;
    }
    void ligar(){
        motor.ligado = true;
    }
    boolean estaLigado(){
        return motor.ligado;
    }

    void alertar(){
        if(frenteEsquerda.abrir()) {
            System.out.println("Porta do motorista aberta");
            desligar();
        }  if(frenteDireita.abrir()) {
            System.out.println("Porta do passageiro aberta");
            desligar();
        }  if(trasEsquerda.fechado = false) {
            System.out.println("Porta de tras a esquerda aberta");
            desligar();
        }  if(trasDireita.fechado = false) {
            System.out.println("Porta de tras a direita aberta");
            desligar();
        }
    }
}
