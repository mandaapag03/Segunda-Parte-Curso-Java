package matriz.videoAulaMatrizes;

import java.util.Arrays;

public class Aula1E2MatrizesVideo {
    public static void main(String[] args) {
        
        double notasDoAluno[][] = new double[3][4];
        
        notasDoAluno[0][0] = 10;
        notasDoAluno[0][1] = 6.4;
        notasDoAluno[0][2] = 9.8;
        notasDoAluno[0][3] = 10;
        
        notasDoAluno[1][0] = 9;
        notasDoAluno[1][1] = 6;
        notasDoAluno[1][2] = 8.6;
        notasDoAluno[1][3] = 5.4;
        
        notasDoAluno[2][0] = 1.5;
        notasDoAluno[2][1] = 5.7;
        notasDoAluno[2][2] = 4.9;
        notasDoAluno[2][3] = 6;
        //System.out.println(notasDoAluno[i]); //É impresso o endereço de memória das variáveis.

        double total;
        int contador = 0;
        for(int i = 0; i < notasDoAluno.length; i++){ //---> o length é a quantidade de arrays na matriz
            contador++; //soma +1 no proximo aluno
            total = 0; // soma volta a 0
            for (int j = 0; j < notasDoAluno[i].length; j++) {; //---> o length é da quantidade de variaveis no array
                total += notasDoAluno[i][j]; 
            }
            System.out.printf("Média do aluno %d: %.2f \n", contador, total/4);
        }
//---------------------------------------------------------------------------------------------------------->        
        //output dos vetores
        String [] abecedario = {"a","b","c","d"};
        System.out.println(Arrays.toString(abecedario));

        for (int i = 0; i < abecedario.length; i++) {
        System.out.println(abecedario[i]); 
        }
        System.out.println();

        //output da matriz
        double coordenadas[][] = {{47.8,94.5,64.8},{45.6,21.5,35.9}}; //2 X 3
        //Qual vetor??
        for (int i = 0; i < coordenadas.length; i++) { //nunca chega a 2 (index),length = 3
            //Qual elemento??
            for (int j = 0; j < coordenadas[i].length; j++) { // precisa chegar a 2 (index), length = 3
                
                System.out.println(coordenadas[i][j] + " ");
            }
        }
        System.out.println(coordenadas.length);// 2
    }
}