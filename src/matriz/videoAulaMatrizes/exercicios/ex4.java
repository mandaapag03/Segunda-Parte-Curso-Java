package matriz.videoAulaMatrizes.exercicios;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][][] agenda = new String[31][24][1];

        for(int i = 0; i < agenda.length; i++){
            for(int j = 0; j < agenda[i].length; j++){
                for(int k = 0; k < agenda[i][j].length; k++){
                    System.out.println("Compromissos:\nDigite 'add' para adicionar um compromisso, ou 'x' para sair");
                    String teclado = sc.next();
                    if(teclado.equalsIgnoreCase("add")){
                        System.out.println("Editar compromissos: (Digite 'x' para sair)");
                        agenda[i][j][k] = sc.next();
                        if(agenda[i][j][k].equals("x")){
                            break;
                        }
                    }else {
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}