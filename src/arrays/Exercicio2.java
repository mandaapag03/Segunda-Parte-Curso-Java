package arrays;

import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {
        //datatype VariableName [] = new datatype [size];
        double notasDoAlunoA [] = new double[4];

        notasDoAlunoA[0] = 7.9;
        notasDoAlunoA[1] = 5.7;
        notasDoAlunoA[2] = 8;
        notasDoAlunoA[3] = 7.5;
        String notas = Arrays.toString(notasDoAlunoA);
        System.out.println(notas);

        double somaA = 0;
        //Forma de percorrer um array: Foreach
        for(double nAlunoA: notasDoAlunoA){
            somaA += nAlunoA;
        }
        System.out.printf("Média = %.2f \n", somaA/notasDoAlunoA.length);
//--------------------------------------------------------------------
        double notasDoAlunoB [] ={6.7, 5.9, 9.8, 10}; 
        
        System.out.println(Arrays.toString(notasDoAlunoB));

        double somaB = 0;
        for (double nAlunob:notasDoAlunoB) {
            somaB += nAlunob;
        }      
        System.out.printf("Média: %.2f \n", somaB/notasDoAlunoB.length);
    }
}