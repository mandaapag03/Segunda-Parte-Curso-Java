package arrays.DesafioArrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //armazena quantidade de notas
        System.out.println("Informe a quantidade de notas que quer informar: ");
        int quantDenotas = scanner.nextInt();

        double notas[] = new double[quantDenotas];

        //armazena notas
        int contador = 0;
        System.out.println("Informe as notas: ");
        for(int i = 0; i < notas.length; i++){
            contador ++;
            System.out.print("Nota " + contador + ": " );
            double entrada = scanner.nextDouble();
            notas[i] = entrada;
        }
        //calcula média
        double soma = 0;
        for(double notasDoAluno: notas){
            soma += notasDoAluno;
        }
        System.out.printf("Média: %.2f", soma/notas.length);

        scanner.close();
    }
}