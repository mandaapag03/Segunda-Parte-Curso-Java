package matriz.videoAulaMatrizes.exercicios;

import java.util.Random;

public class ex1 {
    public static void main(String[] args) {

        int[][][][] M = new int[4][4][4][4];

        int menorIntJava = Integer.MIN_VALUE; // Menor inteiro que o Java pode ter
        int indiceMaiori;
        int indiceMaiorj;
        int indiceMaiork;
        int indiceMaiorl;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;

        for (i = 0; i < M.length; i++) {
            for (j = 0; j < M[i].length; j++) {
                for (k = 0; k < M[i][j].length; k++) {
                    for (l = 0; l < M[i][j][k].length; l++) {
                        Random variavelL = new Random();
                        M[i][j][k][l] = variavelL.nextInt(10);
                        System.out.printf("%4d", M[i][j][k][l]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
            if (M[i][j][k][l] > menorIntJava) {
                menorIntJava = M[i][j][k][l];
                indiceMaiori = i;
                indiceMaiorj = j;
                indiceMaiork = k;
                indiceMaiorl = l;
                System.out.printf("O maior elemento é %d, no índice[%d][%d][%d][%d]", menorIntJava, indiceMaiori,
                indiceMaiorj, indiceMaiork, indiceMaiorl);
            }
        }
    }
}