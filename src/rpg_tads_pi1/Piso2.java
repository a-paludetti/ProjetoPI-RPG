/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_tads_pi1;

import static rpg_tads_pi1.RPG_TADS_PI1.entrada;
import static rpg_tads_pi1.RPG_TADS_PI1.HP;
import java.util.Arrays;

/**
 *
 * @author Red
 */
public class Piso2 {

    public int quarto6(String N) {
        int HP, quarto = 0;
        System.out.println("((porta fecha com um PAN! não é possível voltar."
                + "+1 corredor com 1 portas e outra escada (fun!) todas abertas :D");
        String escolha = entrada.nextLine();
        System.out.println("");

        switch (escolha) {

            case "1":
                quarto = 1;
                quarto7(quarto);
                break;
            case "2":
                quarto = 2;
                quarto8(quarto);
                break;
            case "3":
                quarto = 3;
                quarto9(quarto);
            default:
                System.out.println("Opção inválida");
                break;
        }
        return quarto;
    }

    public String quarto7(int N) {
        String escolha1, escolha2 = "", palavra = "", escolha3 = "", escolha4 = "";

        System.out.println("A porta está trancada,  você consegue ver uma luz - "
                + "talvez branca? ou azul? - pela fresta."
                + "\n> 1 - Olhar pelo buraco da chave."
                + "\n> 2 - Voltar ao corredor.");
        escolha1 = entrada.nextLine();
        System.out.println("");
        if (escolha1.contains("1")) {
            System.out.println("Você vê parte da sala, apenas um quarto branco."
                    + "\n> 1 - Tentar a segunda porta."
                    + "\n> 2 - Voltar ao corredor.");
            escolha2 = entrada.nextLine();
            System.out.println("");
            if (escolha2.contains("1")) {
                quarto4(2);
            } else {
                quarto2(escolha4);
            }
            return escolha4;
        } else {
            quarto2(escolha4);
        }

        return escolha4;
    }

    public String quarto8(int N) {
        String escolha1, escolha2 = "", palavra = "", escolha3 = "", escolha4 = "";

        System.out.println("((BOOOOO!!!!))");
        escolha1 = entrada.nextLine();
        System.out.println("");
        if (escolha1.contains("1")) {
            System.out.println("Você vê parte da sala, apenas um quarto branco."
                    + "\n> 1 - Tentar a segunda porta."
                    + "\n> 2 - Voltar ao corredor.");
            escolha2 = entrada.nextLine();
            System.out.println("");
            if (escolha2.contains("1")) {
                quarto4(2);
            } else {
                quarto2(escolha4);
            }
            return escolha4;
        } else {
            quarto2(escolha4);
        }

        return escolha4;
    }

    public static String quarto9(int N) {
        String escolha1, escolha2 = "", palavra = "", escolha3 = "", escolha4 = "";

        System.out.println("((MEEEEEEHH!!))");
        escolha1 = entrada.nextLine();
        System.out.println("");
        if (escolha1.contains("1")) {
            System.out.println("Você vê parte da sala, apenas um quarto branco."
                    + "\n> 1 - Tentar a segunda porta."
                    + "\n> 2 - Voltar ao corredor.");
            escolha2 = entrada.nextLine();
            System.out.println("");
            if (escolha2.contains("1")) {
                quarto4(2);
            } else {
                quarto2(escolha4);
            }
            return escolha4;
        } else {
            quarto2(escolha4);
        }

        return escolha4;
    }

}
