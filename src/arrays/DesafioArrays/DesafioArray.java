package arrays.DesafioArrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas: ");
        int index = scanner.nextInt();

        double notas[] = new double[index];

        System.out.println("Informe as notas: ");
        for(int i = 0; i < index; i++){
            System.out.print("-  ");
            double entrada = scanner.nextDouble();
            entrada += notas[index];
        }

        scanner.close();
    }
}