/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_tads_pi1;

import java.util.Arrays;
import static rpg_tads_pi1.RPG_TADS_PI1.entrada;
import static rpg_tads_pi1.RPG_TADS_PI1.HP;

/**
 *
 * @author Red
 */
public class Piso3 {


    public int quarto10(String N) {
        int HP, quarto = 0;
        System.out.println("Na sua frente se extende um corredor escuro,"
                + " você consegue ver 3 portas a sua esquerda, uma claramente destruída."
                + "\nAs outras duas estão intáctas; ao final uma escada,"
                + " você consegue notar um vulto estranho aguardando em frente."
                + "\n> 1 - tentar a primeira porta."
                + "\n> 2 - tentar a segunda porta."
                + "\n> 3 - ir em direção a escada.");
        String escolha = entrada.nextLine();
        System.out.println("");

        switch (escolha) {

            case "1":
                quarto = 1;
                quarto3(quarto);
                break;
            case "2":
                quarto = 2;
                quarto4(quarto);
                break;
            case "3":
                quarto = 3;
                quarto5(quarto);
            default:
                System.out.println("Opção inválida");
                break;
        }
        return quarto;
    }

    public String quarto11(int N) {
        String escolha1, escolha2 = "", palavra = "", escolha3 = "", escolha4 = "";
        if (N == 1) {
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
        }
        if (N == 2) {
            System.out.println("Ao abrir a porta você se depara com um quarto vazio;"
                    + "\nUma luz fraca illumina as paredes brancas, você não vê nenhuma porta."
                    + "\n> 1 - Examinar o quarto."
                    + "\n> 2 - Voltar ao corredor.");
            escolha1 = entrada.nextLine();
            System.out.println("");
            if (escolha1.equals("1")) {
                System.out.println("Ao chegar mais perto você vê que as paredes são cinzas com respingos de tinta"
                        + "\nNa sua frente a parede parece suja com respingos pretos e cinzas, na sua direita, onde estava a fechadura, ainda mais respingos."
                        + "\nA mulher das suas memórias, a tinta, você começa a sentir um senso de Dejà-vu..."
                        + "\n> 1 - Jogar a tinta no chão."
                        + "\n> 2 - Jodas a tinta na parede."
                        + "\n> 3 - Voltar ao corredor.");
                escolha2 = entrada.nextLine();
                System.out.println("");
                if (escolha2.contains("1") || escolha2.contains("2")) {
                    System.out.println("((memória 01 - museu + tea tray.");
                    System.out.println("((tomar chá?"
                            + "\n> 1 - SIM"
                            + "\n> 2 - NÃO))");
                    escolha3 = entrada.nextLine();
                    System.out.println("");
                    if (escolha3.contains("1")) {
                        System.out.println("HP + 10");
                        escolha4 = "10";
                        HP(escolha4);
                        System.out.println("");
                        quarto2(escolha4);
                    } else {
                        System.out.println("((sai do quarto))");
                        escolha4 = "";
                        quarto2(escolha4);
                    }
                } else {
                    quarto2(palavra);
                }
            } else {
                quarto2(palavra);
            }

            return escolha4;
        }
        return escolha4;
    }

    public String quarto12(int N) {
        int jogo, escolha = 0;
        String palavra = "", escolha1 = "", escolha2 = "";
        boolean valido = false;

        if (N == 2) {
            do {
                System.out.println("A porta está aberta, você vê uma sala ampla, porém vazia."
                        + "\nA sua direita as janelas estão vedadas com tabuas de madeira apenas a luz fraca de fora ilumina o lugar."
                        + "\nNa parede a esquerda algumas letras como se formassem palavras, uma lata de tinta pequena e aberta em frente."
                        + "\n> 1 - Jogar."
                        + "\n> 2 - Voltar ao corredor.");
                escolha1 = entrada.nextLine();
                System.out.println("");
                if (escolha1.equals("1") || escolha1.equals("2")) {
                    if (escolha1.contains("1")) {
                        System.out.println("Na parede as letras"
                                + "\n - - Q - - - E - T A"
                                + "\nVocê começa a preencher as letras...");
                        System.out.println("");
                        palavra = "ARQUITETA";
                        jogo = jogoDaForca01(palavra);
                        if (jogo == 1) {
                            System.out.println("Você olha a palavra na parede, você tem uma vaga recordação de uma mulher."
                                    + "\nA lata de tinta esta quase vazia, você pega mesmo assim.");
                            System.out.println("");
                            quarto3(2);
                        } else {
                            System.out.println("Jogar de Novo?"
                                    + "\n> 1 - SIM."
                                    + "\n> 2 - NÃO");
                            escolha2 = entrada.nextLine();
                            if (escolha2.equals("1")) {
                                palavra = "ARQUITETA";
                                jogo = jogoDaForca01(palavra);
                                if (jogo == 1) {
                                    quarto3(2);
                                }
                            } else {
                                quarto2(palavra);
                            }
                        }
                    } else {
                        quarto2(palavra);
                    }
                    valido = true;
                } else {
                    System.out.println("Opção invalida");
                }
            } while (!valido);

        }

        return escolha1;
    }

    public String quarto13(int N) {
        String escolha01, escolha3 = "", escolha4 = "", status = "";
        int HP;
        boolean passar = false;
        do {
            System.out.println("((sem batalha - escada indo para baixo))");
            System.out.println("((desci~~ida talvez uma sombra no fundo???");
            System.out.println("((algum modo do jogador desenhar uma fechadura no papel e colocar na porta))");
            escolha01 = entrada.nextLine();
            if (escolha01.contains("1")) {
                System.out.println("((porta abre + tea tray.))");
                System.out.println("((tomar chá?"
                        + "\n> 1 - SIM"
                        + "\n> 2 - NÃO))");
                escolha3 = entrada.nextLine();
                System.out.println("");
                passar = true;
                if (escolha3.contains("1")) {
                    System.out.println("HP + 10");
                    escolha4 = "10";
                    HP(escolha4);
                    System.out.println("");
                    quarto2(escolha4);
                } else {
                    System.out.println("((sai do quarto))");
                    escolha4 = "";
                    quarto2(escolha4);
                }
            }

        } while (passar = false);

        return status;
    }

}
