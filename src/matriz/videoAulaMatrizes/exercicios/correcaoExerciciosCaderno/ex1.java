package matriz.videoAulaMatrizes.exercicios.correcaoExerciciosCaderno;

import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        
        int maiorNum = 0;
        int indexi = 0;
        int indexj = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Random r = new Random();
                int num = r.nextInt(10);
                matriz[i][j] = num;
                if (matriz[i][j] > maiorNum) {
                    maiorNum = matriz[i][j];
                    indexi = i;
                    indexj = j;
                }
            }
        }
        System.out.printf("O maior número da matriz é %d, posição[%d][%d]",maiorNum, indexi, indexj);
    }
}