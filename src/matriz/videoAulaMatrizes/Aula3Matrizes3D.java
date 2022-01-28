package matriz.videoAulaMatrizes;

public class Aula3Matrizes3D {
    public static void main(String[] args) {

        int [][][] matrizTridimensional = new int [3][3][3];
        

        for(int i = 0; i < matrizTridimensional.length; i ++ ){
            for(int j = 0; j < matrizTridimensional[i].length; j ++){
                for(int k = 0; k < matrizTridimensional[i][j].length; k ++){
                    matrizTridimensional[i][j][k] = i + j + k;
                    System.out.printf("i = %d\nj = %d\nk = %d\n", i, j, k);
                   /*  System.out.printf("%3d", matrizTridimensional[i][j][k]); */
                }
                System.out.println();
            }
            System.out.println();
        }
        int somaTotal = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for(int i = 0; i < matrizTridimensional.length; i ++ ){
            for(int j = 0; j < matrizTridimensional[i].length; j ++){
                for(int k = 0; k < matrizTridimensional[i][j].length; k ++){
                    somaTotal += matrizTridimensional[i][j][k];

                    if (matrizTridimensional[i][j][k] % 2 ==0){
                        somaPares += matrizTridimensional[i][j][k];
                    } else {
                        somaImpares += matrizTridimensional[i][j][k];
                    }
                }
            }
        }
        System.out.println("Soma total: " + somaTotal);
        System.out.println("Pares: " + somaPares);
        System.out.println("Impares: " + somaImpares);
    }
}