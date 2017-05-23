/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_tads_pi1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wynter
 */
public class RPG_TADS_PI1 {

    static Scanner entrada = new Scanner(System.in);

    public static String quarto1() {
        String escolha1, escolha2, escolha3, escolha4 = "";
        int i = 0;

        System.out.println("Você acorda em um quarto escuro, uma lâmpada fraca e amarela iluminando o lugar que você deita."
                + "\n> 1 - olhar em volta;"
                + "\n> 2 - continuar deitado;");
        escolha1 = entrada.nextLine();

        if (escolha1.contains("1")) {
            System.out.println("Na sua frente tem uma mesa, apenas papel e caneta por cima. Na sua direita uma porta."
                    + "\n> 1 - tentar a porta"
                    + "\n> 2 - pegar papel e caneta.");
            escolha2 = entrada.nextLine();
            if (escolha2.contains("1")) {
                System.out.println("A porta está trancada."
                        + "\n> 1 - tentar a porta novamente."
                        + "\n> 2 - pegar papel e caneta.");
                escolha3 = entrada.nextLine();
                while (escolha3.contains("1")) {
                    System.out.println("A porta está trancada."
                            + "\n> 1 - tentar a porta novamente."
                            + "\n> 2 - pegar papel e caneta.");
                    escolha3 = entrada.nextLine();
                    i++;
                }
                if (escolha3.contains("2")) {
                    System.out.println("Você pega o papel e a caneta, embaixo tem uma chave, provavelmente da porta."
                            + "\n> 1 - tentar a porta");
                    escolha4 = entrada.nextLine();
                }
            } else {
                System.out.println("Você pega o papel e a caneta, embaixo tem uma chave, provavelmente da porta."
                        + "\n> 1 - tentar a porta");
                escolha4 = entrada.nextLine();
            }
        } else {
            System.out.println("Você ouve um barulho atras da porta a sua direita, como de algo quisesse entrar."
                    + "\n> 1 - olhar em volta"
                    + "\n> 2 - continuar deitado");
            escolha2 = entrada.nextLine();
            if (escolha2.contains("2")) {
                do {
                    System.out.println("Você ouve um barulho atras da porta a sua direita, como de algo quisesse entrar."
                            + "\n> 1 - olhar em volta"
                            + "\n> 2 - continuar deitado");
                    escolha2 = entrada.nextLine();
                    i++;
                } while (i < 1);
                System.out.println("Você ouve o barulho da porta quebrando, consegue ver apenas um vulto antes que a luz se apague."
                        + "\nUma voz feminina parece vir de longe... 'Perda de tempo, vamos tentar com outro.'"
                        + "\n ~*~GAME OVER~*~");
                System.out.println("Tentar novamente?"
                        + "\n> SIM (1)"
                        + "\n> NÃO (2)");
                escolha3 = entrada.nextLine();
                if (escolha3.contains("1")) {
                    quarto1();
                }
            } else {
                System.out.println("A porta está trancada."
                        + "\n> 1 - tentar a porta novamente."
                        + "\n> 2 - pegar papel e caneta.");
                escolha3 = entrada.nextLine();
                while (escolha3.contains("1")) {
                    System.out.println("A porta está trancada."
                            + "\n> 1 - tentar a porta novamente."
                            + "\n> 2 - pegar papel e caneta.");
                    escolha3 = entrada.nextLine();
                    i++;
                }

                if (escolha3.contains("2")) {
                    System.out.println("Você pega o papel e a caneta, embaixo tem uma chave, provavelmente da porta."
                            + "\n> 1 - tentar a porta");
                    escolha4 = entrada.nextLine();
                }
            }
        }
        return escolha4;
    }

    public static int quarto2(String N) {
        int quarto = 0;
        switch (N) {
            case "1":
                quarto = 1;
                break;
            case "2":
                quarto = 2;
                break;
            case "3":
                quarto = 3;
            default:
                System.out.println("Opção inválida");
                break;
        }
        return quarto;
    }

    public static int quarto3(int N) {
        String escolha1;
        int escolha2 = 0, escolha3 = 0;

        if (N == 1) {
            System.out.println("A porta está trancada,  você consegue ver uma luz - branca? azul? - pela fresta."
                    + "\n> 1 - Olhar pelo buraco da chave."
                    + "\n> 2 - Tentar a segunda porta.");
            escolha1 = entrada.nextLine();
            switch (escolha1) {
                case "1":
                    System.out.println("Você vê parte da sala, apenas um quarto branco."
                            + "\n> 1 - Tentar a segunda porta."
                            + "\n> 2 - voltar ao corredor.");
                    escolha2 = entrada.nextInt();
                    if (escolha2 == 1) {
                        escolha3 = 1;
                    } else {
                        escolha3 = 2;
                    }
                    break;
                case "2":
                    
            }
        }
        System.out.println(
                "Na sua frente se extende um corredor escuro, você consegue ver 3 portas a sua esquerda,"
                + " uma claramente destruídas, as outras não, ao final uma escada, você consegue notar um vulto estranho aguardando no final."
                + "\n> 1 - tentar a primeira porta."
                + "\n> 2 - tentar a segunda porta."
                + "\n> 3 - ir em direção a escada.");
        escolha1 = entrada.nextLine();

        switch (escolha1) {

            case "2":
                System.out.println("A porta está aberta, você vê uma sala ampla, porém vazia,"
                        + "as janelas estão vedadas com tábuas de madeira, apenas a luz fraca de fora ilumina o lugar.");
        }

        return escolha;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String N = quarto1();
        System.out.println("Você abre a porta com uma certa dificuldade, a chave quebra quando você tenta tirá-la da maçaneta.");
        quarto2(N);
    }

}
