package arrays;
//Alterar tags ao mesmo tempo : ctrl + shift + L
import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {
        //datatype VariableName [] = new datatype [size];
        double notasDoAlunoA [] = new double[4];

        //Forma 1 de declarar um array
        notasDoAlunoA[0] = 7.9;
        notasDoAlunoA[1] = 5.7;
        notasDoAlunoA[2] = 8;
        notasDoAlunoA[3] = 7.5;
        
        //Imprimindo array
        String notas = Arrays.toString(notasDoAlunoA);
        System.out.println(notas);

        //Forma de percorrer um array: For
        double totalAlunoA = 0;
        for(int i = 0; i < notasDoAlunoA.length; i++){
            totalAlunoA += notasDoAlunoA[i];
        }
        System.out.println("Média = " + totalAlunoA / notasDoAlunoA.length);
//--------------------------------------------------------------------
       // Forma 2 de declarar um array
        double notasDoAlunoB [] ={6.7, 5.9, 9.8, 10}; 
        
        //output do array
        System.out.println(Arrays.toString(notasDoAlunoB));

        double somaNotasAlunoB = 0;
        for (int index = 0; index < notasDoAlunoB.length; index++) {
             somaNotasAlunoB += notasDoAlunoB[index];
        }
        System.out.printf("Média = %.2f", somaNotasAlunoB/notasDoAlunoB.length);        
    }

    
}