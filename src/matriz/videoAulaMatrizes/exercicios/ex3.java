package matriz.videoAulaMatrizes.exercicios;

import java.util.Arrays;
/* import java.util.Arrays; */
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os valores inteiros: ");
        int[][] matriz = new int[3][3];

        int a = 0;
        int b = 0;
        int valores = 0;
        int pares = 0;
        int impares = 0;
        for (a = 0; a < matriz.length; a++) {
            for (b = 0; b < matriz[a].length; b++) {
                System.out.printf("Coluna %d - Linha %d = ", a + 1, b + 1);
                valores = sc.nextInt();
                matriz[a][b] = valores;
                if(matriz[a][b] %2 == 0){
                    pares ++;
                }else{
                    impares ++;
                }
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(matriz));
        System.out.printf("Há %d pares e %d ímpares", pares, impares);
        sc.close();
    }

}