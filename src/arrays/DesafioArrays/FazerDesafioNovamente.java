package arrays.DesafioArrays;

import java.util.Locale;
import java.util.Scanner;

public class FazerDesafioNovamente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe quantidade de notas que quer informar: ");
        int length = teclado.nextInt();

        double notas[] = new double[length];

        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe as notas: ");
            contador++;
            System.out.println("Nota " + contador + ": ");
            double nota = teclado.nextDouble();
            notas[i] = nota;
        }
        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas+=nota;
        }
        double media = somaNotas/notas.length;
        System.out.printf("Média: %.2f", media);

        teclado.close();
    }
    
}