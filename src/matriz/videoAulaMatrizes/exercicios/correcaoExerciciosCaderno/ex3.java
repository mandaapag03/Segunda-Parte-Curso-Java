package matriz.videoAulaMatrizes.exercicios.correcaoExerciciosCaderno;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os valores");

        int[][] matriz = new int[3][3];

        int pares = 0;
        int impares = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.printf("Coluna %d - Linha %d: ", i + 1, j + 1);
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 == 0 ){
                    pares ++;
                }else{
                    impares ++;
                }            
            }
        }
        for(int [] m: matriz){
            for(int l: m){
                System.out.printf("%2d", l);
            }
            System.out.println(" ");
        }
        System.out.printf("Há %d pares e %d ímpares", pares, impares);

        sc.close();
    }
}