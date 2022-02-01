package matriz.videoAulaMatrizes.exercicios.correcaoExerciciosCaderno;

import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[10][10];

        int maiorColuna = 0;
        int menorColuna = 9;
        int maiorLinha = 0;
        int menorLinha = 9;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                Random r = new Random();
                int num = r.nextInt(10);
                matriz[i][j] = num;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[7][j] > maiorColuna){
                    maiorColuna = matriz[7][j];
                }
                if (matriz[7][j] < menorColuna) {
                    menorColuna = matriz[7][j];
                }
                if (matriz[i][5] > maiorLinha) {
                    maiorLinha = matriz[i][5];
                }
                if (matriz[i][5] < menorLinha) {
                    menorLinha = matriz[i][5];
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.printf("O maior número da linha 5 é %d e o menor é %d \n", maiorLinha, menorLinha);
        System.out.printf("O maior número da coluna 7 é %d e o menor é %d ", maiorColuna, menorColuna);
    }
}