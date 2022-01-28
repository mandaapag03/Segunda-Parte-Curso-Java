package matriz.outputMatriz;

import java.util.Arrays;

public class outputMatriz {
    public static void main(String[] args) {

        String[][] names = {
                { "Ana", "James" },
                { "Carls", "Vick" } };
        System.out.println(Arrays.deepToString(names));
        // deepToString : Converte arrays multidimensionais em string.

        System.out.println();

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j] + " ");
            }
        }
        System.out.println();

        for(int i = 0; i < names.length; i ++ ){
            for(int j = 0; j < names[i].length; j++ ){
                System.out.println(names[i][j]);
            }
        }
        System.out.println();

        for(int i = 0; i < names.length; i++){
            for(int j = 0; j < names[i].length; j++){
                System.out.printf("%2s ", names[i][j]);
            }
        }
        System.out.println();

        for(String [] nome:names){
            System.out.println(Arrays.toString(nome));
        }

    }
}