package src.OO;

public class teste {
    public static void main(String[] args) {
        Carro Fiatinho = new Carro();

        Fiatinho.ligar();
        System.out.println(Fiatinho.estaLigado());
        Fiatinho.frenteEsquerda.abrir();
        System.out.println(Fiatinho.estaLigado());
        Fiatinho.acelerar();

    }
}
