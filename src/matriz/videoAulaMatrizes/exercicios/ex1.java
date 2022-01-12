package matriz.videoAulaMatrizes.exercicios;

import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        
        int [][][][] M = new int [4][4][4][4];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                for (int k = 0; k < M[i][j].length; k++) {
                    for (int l = 0; l < M[i][j][k].length; l++) {
                        Random variavelL = new Random(); 
                        M[i][j][k][l] = variavelL.nextInt(10); 
                        System.out.printf("%4d", M[i][j][k][l]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}