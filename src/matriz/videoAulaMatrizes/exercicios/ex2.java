package matriz.videoAulaMatrizes.exercicios;

import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
       
        int [][] M = new int [10][10];

        int maiorValorLinha = 0;
        int menorValorLinha = 9;
        int maiorValorColuna = 0;
        int menorValorColuna = 9;

        for(int a = 0; a < M.length; a++){
            for(int b = 0; b < M[a].length; b++){
               Random numero = new Random();
               M[a][b] = numero.nextInt(10);
               System.out.printf("%10d", M[a][b]);
               if(M[a][4] > maiorValorLinha) {maiorValorLinha = M[a][4];}
               if(M[a][4] < menorValorLinha){menorValorLinha = M[a][4];}

               if(M[6][b] > maiorValorColuna){maiorValorColuna = M[6][b];}
               if(M[6][b] < menorValorColuna){menorValorColuna = M[6][b];}
            }
                 System.out.println();
            }
            System.out.println();
            System.out.printf("O maior valor da linha 5 é %d e o menor é %d \n", maiorValorLinha, menorValorLinha);
            System.out.printf("O maior valor da coluna 7 é %d e o menor é %d", maiorValorColuna, menorValorColuna);
        }
    }
