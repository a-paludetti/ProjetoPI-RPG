/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_tads_pi1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Red
 */
public class jogodavelha {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        boolean venceu = false;

        String x, palavra = "ARQUITETA";
        int w = 0, z, y = palavra.length();
        String[] palavra03 = new String[y];
        String[] palavra04 = new String[y];

        palavra04[2] = palavra.substring(2, 3);
        palavra04[8] = palavra.substring(8, 8 + 1);
        palavra04[7] = palavra.substring(7, 8);
        palavra04[6] = palavra.substring(6, 7);

        for (int i = 0; i < y; i++) {
            palavra03[i] = palavra.substring(i, i + 1);
        }

        for (int k = 0; k < y; k++) {
            System.out.print("Digite uma letra: ");
            x = NN.nextLine();
            x = x.toUpperCase();
            if (palavra.contains(x)) {
                z = palavra.indexOf(x);
                palavra04[z] = x;
                for (int j = 0; j < y; j++) {
                    if (palavra04[j] == null) {
                        palavra04[j] = "-";
                    }
                    System.out.print(palavra04[j] + " ");
                }
                if (Arrays.equals(palavra03, palavra04)) {
                    venceu = true;
                    System.out.println("");
                    System.out.println("Você tenta a última letra - correta - e ouve o barulho da porta abrindo.");
                    System.out.println("");
                    break;
                }
                System.out.println("");
            } else {
                System.out.println("-1 chance");
                w = w + 1;
                if (w == 3) {
                    System.out.println("Você tenta a última letra - errada - a ouve uma risada vindo do corredor. A porta continua fechada. ");
                    venceu = false;
                    break;
                }
            }

        }
    }
}