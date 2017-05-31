/*2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_tads_pi1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Wynter
 */
public class RPG_TADS_PI1 {

    static Scanner entrada = new Scanner(System.in);

    public static int HP(String N) {
        int HP = 100, HP1;
        HP1 = Integer.parseInt(N);
        HP = HP + HP1;
        return HP;
    }

    public static int monsto(int x) {
        Random hpm = new Random();
        int monster = 0;
        if (x == 1) {
            monster = hpm.nextInt(5);
        }
        return monster;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Piso1 p1 = new Piso1();

        ArrayList<String> itens = new ArrayList<>();

        String dado1 = p1.quarto1();
        int dado2 = p1.quarto2(dado1);

        try {
            startGame(dado1);
        } catch (Exception e) {

            System.out.println("rpg_tads_pi1.RPG_TADS_PI1.main() " + e);
        }
    }

    private static void startGame(String character) {
        Piso2 p2 = new Piso2();
        p2.quarto6(character);

        Piso3 p3 = new Piso3();
        p3.quarto10(character);

    }
}
