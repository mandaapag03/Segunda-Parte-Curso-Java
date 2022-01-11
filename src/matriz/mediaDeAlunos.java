package matriz;

import java.util.Locale;
import java.util.Scanner;

public class mediaDeAlunos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

    //quantidade de alunos

        System.out.println("Informe quantidade de alunos: ");
        int nAlunos = scanner.nextInt();

    //quantidade de notas
        
        System.out.println("Informe quantidade de notas pro aluno: ");
        int nNotas = scanner.nextInt();

    //define uma matriz

        double notasDosAlunos[][] = new double[nAlunos][nNotas];

    //percorrer matriz armazenando notas de cada aluno

        double soma;
        for (int i = 0; i < notasDosAlunos.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": ");
            soma = 0;
            for (int j = 0; j < notasDosAlunos[i].length; j++) {
                System.out.printf("Informe nota %d : ", (j + 1));
                double nota = scanner.nextDouble();
                soma += nota;
            }

    //calcula a média de cada aluno e indica o status

            double media = soma / nNotas;
            System.out.printf("Média do aluno %d = %.2f \n", (i + 1), media);

            if (media >= 6) {
                System.out.println("Status: Aprovado\n");
            } else {
                System.out.println("Status: Reprovado\n");
            }
        }

        scanner.close();
    }

}