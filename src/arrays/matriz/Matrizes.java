package arrays.matriz;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //armazena quantAlunos
        System.out.println("Informe o número de alunos: ");
        int quantAlunos = scanner.nextInt();
        
        //armazena quantNotasPorAluno
        System.out.println("Informe o número de notas por aluno: ");
        int quantNotasPorAluno = scanner.nextInt();

        //Inicializa array de duas dimensões
        double [][] notasDaTurma = new double[quantAlunos][quantNotasPorAluno];

        //percorre duas arrays (externa e interna)
        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) { //externo
            for (int n = 0; n < notasDaTurma[a].length; n++) { //interno
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = scanner.nextDouble();
                total += notasDaTurma[a][n];
            }
        }
        double media = total / (quantAlunos * quantNotasPorAluno);
        System.out.printf("Média da turma: %.2f", media);

        scanner.close();
    }
    
}