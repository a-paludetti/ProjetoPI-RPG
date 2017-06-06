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
import rpg_tads_pi1.jogodavelha;

/**
 *
 * @author Wynter
 */
public class RPG_TADS_PI1 {

    static Scanner entrada = new Scanner(System.in);
    static jogodavelha JVelha = new jogodavelha();

    public static String quarto1() {
        String escolha1, escolha2, escolha3 = "", escolha4 = "";
        int i = 0;

        System.out.println("Você acorda em um quarto escuro, uma lâmpada fraca e amarela iluminando o lugar que você deita."
                + "\n> 1 - olhar em volta;"
                + "\n> 2 - continuar deitado;");
        escolha1 = entrada.nextLine();
        System.out.println("");
        if (escolha1.contains("1")) {
            System.out.println("Na sua frente tem uma mesa, apenas papel e caneta por cima. Na sua direita uma porta."
                    + "\n> 1 - abrir a porta"
                    + "\n> 2 - pegar papel e caneta.");
            escolha2 = entrada.nextLine();
            System.out.println("");
            if (escolha2.contains("1")) {
                System.out.println("A porta está trancada."
                        + "\n> 1 - tentar abrir a porta novamente."
                        + "\n> 2 - pegar papel e caneta.");
                while (escolha3.contains("1")) {
                    System.out.println("A porta está trancada."
                            + "\n> 1 - tentar abrir a porta novamente."
                            + "\n> 2 - pegar papel e caneta.");
                    escolha3 = entrada.nextLine();
                    System.out.println("");
                    i++;
                }
                if (escolha3.contains("2")) {
                    System.out.println("Você pega o papel e a caneta, embaixo tem uma chave, provavelmente da porta."
                            + "\n> 1 - abrir a porta");
                    escolha4 = entrada.nextLine();
                    System.out.println("");
                }
            } else {
                System.out.println("Você pega o papel e a caneta, embaixo tem uma chave, provavelmente da porta."
                        + "\n> 1 - abrir a porta");
                escolha4 = entrada.nextLine();
                System.out.println("");
            }
        } else {
            System.out.println("Você ouve um barulho atras da porta a sua direita, como de algo quisesse entrar."
                    + "\n> 1 - olhar em volta"
                    + "\n> 2 - continuar deitado");
            escolha2 = entrada.nextLine();
            System.out.println("");
            if (escolha2.contains("2")) {
                do {
                    System.out.println("Você ouve um barulho atras da porta a sua direita, como de algo quisesse entrar."
                            + "\n> 1 - olhar em volta"
                            + "\n> 2 - continuar deitado");
                    escolha2 = entrada.nextLine();
                    System.out.println("");
                    i++;
                } while (i < 1);
                System.out.println("Você ouve o barulho da porta quebrando, consegue ver apenas um vulto antes que a luz se apague."
                        + "\nUma voz feminina parece vir de longe... 'Perda de tempo, vamos tentar com outro.'"
                        + "\n ~*~GAME OVER~*~");
                System.out.println("Tentar novamente?"
                        + "\n> SIM (1)"
                        + "\n> NÃO (2)");
                escolha3 = entrada.nextLine();
                System.out.println("");
                if (escolha3.contains("1")) {
                    quarto1();
                    System.out.println("");
                }
            } else {
                System.out.println("Na sua frente tem uma mesa, apenas papel e caneta por cima. Na sua direita uma porta."
                        + "\n> 1 - abrir a porta"
                        + "\n> 2 - pegar papel e caneta.");
                escolha3 = entrada.nextLine();
                System.out.println("");
                while (escolha3.contains("1")) {
                    System.out.println("A porta está trancada."
                            + "\n> 1 - tentar abrir a porta novamente."
                            + "\n> 2 - pegar papel e caneta.");
                    escolha3 = entrada.nextLine();
                    System.out.println("");
                    i++;
                }
                if (escolha3.contains("2")) {
                    System.out.println("Você pega o papel e a caneta, embaixo tem uma chave, provavelmente da porta."
                            + "\n> 1 - abrir a porta");
                    escolha4 = entrada.nextLine();
                    System.out.println("");
                }
            }
        }
        System.out.println("Você abre a porta com uma certa dificuldade,"
                + " a chave quebra quando você tenta tirá-la da maçaneta.");
        System.out.println("");
        return escolha4;
    }

    public static int quarto2(String N) {
        int HP, quarto = 0;
        if (N.contains("end")) {
            quarto = 0;
            return quarto;
        } else {
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
                    break;
            }
        }
        return quarto;
    }

    public static String quarto3(int N) {
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
                    System.out.println("Comforme a tinta se espalha, você lembra de um ocorrido, parece que aconteceu semanas antes, porém é uma das últimas coisas que você "
                            + "\nse lembra antes de acordar no quarto escuro...");
                    System.out.println("");
                    System.out.println("Uma senhora esta caída na rua, um vulto correndo da cena. Ao se aproximar você vê que a mulher não esta machucada, apenas assustada."
                            + "\nAo oferecer ajuda ela apenas pede para ir para casa."
                            + "\nVocê concorda");
                    System.out.println("");
                    System.out.println("Ao voltar a si você ouve um barulho de louça caindo, ao olhar em volta nota um jogo de chá, simples, marrom escuro,"
                            + "\ne um pedaço de bolo de fucá do lado."
                            + "\nTomar o chá?"
                            + "\n> 1 - SIM"
                            + "\n> 2 - NÃO");
                    escolha3 = entrada.nextLine();
                    System.out.println("");
                    if (escolha3.contains("1")) {
                        System.out.println("HP + 10");
                        escolha4 = "10";
                        HP(escolha4);
                        System.out.println("");
                        quarto2(escolha4);
                    } else {
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

    public static String quarto4(int N) {
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

    public static String quarto5(int N) {
        String escolha01, escolha3 = "", escolha4 = "", escolha2 = "", hlt = "";
        int HP;
        boolean passar = false;
        do {
            System.out.println("Quando você se aproxima da escada vê que a figura, na verdade, não passa de uma mancha escura na parede."
                    + "\nVocê se aproxima da escada e vê uma porta ao fundo."
                    + "\n> 1 - Descer a escada."
                    + "\n> 2 - Voltar ao corredor.");
            escolha01 = entrada.nextLine();
            System.out.println("");
            if (escolha01.contains("1")) {
                System.out.println("A porta ao final esta trancada, não há fechadura na porta porém você vê que parte da porta esta descolorida, do tamanho do papel que você tem."
                        + "\nAo colocar o papel contra a porta uma memória vem a sua mente...");
                System.out.println("");
                System.out.println("Você esta em um museu, uma visita durante as férias, uma das obras te chama a atenção."
                        + "\nCom o titulo de 'O Labirinto' a pintura é apenas o desenho do buraco de uma fechadura, não é possível ver nada do vazio do centro da pintura."
                        + "\nEmbaixo uma breve descrição da pintora, Joan Leclaire, desaparecida em 1912 durante a Primeira Guerra, a única obra feita por ela.");
                System.out.println("");
                System.out.println("Ao se lembrar do occorrido você se lembra da caneta, no papel você nota o traçado ce ume fechadura."
                        + "\n> 1 - Tentar abrir a porta."
                        + "\n> 2 - Voltar ao corredor");
                escolha3 = entrada.nextLine();
                System.out.println("");
                if (escolha3.contains("1")) {
                    passar = true;

                    System.out.println("Você preenche o traçado, desenhando uma fechadura no papel, ao terminar você ouve um 'click' da porta se abrindo."
                            + "\nAo passar pela porta você nota um jogo de chá, branquinho, um pedaço de bolo de limão do lado."
                            + "\nTomar o chá?"
                            + "\n> 1 - SIM"
                            + "\n> 2 - NÃO");
                    escolha2 = entrada.nextLine();
                    System.out.println("");
                    if (escolha2.contains("1")) {
                        System.out.println("HP + 10");
                        hlt = "10";
                        HP(hlt);
                        escolha4 = "end";
                        System.out.println("Você passa pela porta com um certo receio, ao atravessar ouve um barulho atrás de você, a porta esta trancada, o buraco da fechadura desapareceu.");
                        System.out.println("");
                        quarto2(escolha4);
                    } else {
                        System.out.println("Você passa pela porta com um certo receio, ao atravessar ouve um barulho atrás de você, a porta esta trancada, o buraco da fechadura desapareceu.");
                        System.out.println("");
                        escolha4 = "end";
                        quarto2(escolha4);
                    }

                } else {
                    quarto2(escolha4);
                }
            } else {
                quarto2(escolha4);
            }

        } while (passar = false);

        return escolha4;
    }

    public static int quarto6(String N) {
        int HP, quarto = 0;
        System.out.println("Você se encontra em um corredor, uma luz branca iluminando o caminho, uma porta à sua direita, entreaberta e outra no final do corredor."
                + "\nVocê sente o ar gelado do vindo da porta."
                + "\n> 1 - tentar a primeira porta."
                + "\n> 2 - tentar a última porta.");
        String escolha = entrada.nextLine();
        System.out.println("");

        switch (escolha) {
            case "1":
                quarto = 1;
                quarto7(quarto);
                break;
            case "2":
                quarto = 2;
                quarto9(quarto);
            default:
                break;
        }
        return quarto;
    }

    public static String quarto7(int N) {
        String escolha1, escolha2 = "", palavra = "", escolha3 = "", escolha4 = "";
        int jogo = 0;

        System.out.println("Você entra em um quarto vazio, a luz branca e as paredes vazias dão a impressão de um quarto de hospital, o cheiro de antiséptico é fraco porém permeia o ar."
                + "\nNo fundo uma outra porta, você vê um tabuleiro 3x3 com um jogo da velha."
                + "\n> 1 - jogar."
                + "\n> 2 - voltar para o corredor");
        escolha1 = entrada.nextLine();
        System.out.println("");
        if (escolha1.contains("1")) {
            palavra = "DESAPARECEU";
            jogo = jogoDaForca01(palavra);
            if (jogo == 1) {
                System.out.println("A porta se abre com um rangido, umma sala pequena, como se fosse um armário.");
                System.out.println("");
                quarto8(0);
            } else {
                System.out.println("Jogar de Novo?"
                        + "\n> 1 - SIM."
                        + "\n> 2 - NÃO");
                escolha2 = entrada.nextLine();
                if (escolha2.equals("1")) {
                    palavra = "DESAPARECEU";
                    jogo = jogoDaForca01(palavra);
                    if (jogo == 1) {
                        quarto8(0);
                    }
                } else {
                    quarto6(palavra);
                }
            }
            System.out.println("volta para o corredor");
            quarto6(escolha4);
        }
        quarto6(escolha4);

        return escolha4;
    }

    public static String quarto8(int N) {
        String escolha1, escolha2 = "", palavra = "", escolha3 = "", escolha4 = "";

        System.out.println("O quarto é pequeno e escuro, você vê um traçado na sua frente e uma corrente velha, antiga, de cobre  na sua frente."
                + "\n> 1 - acender a luz."
                + "\n> 2 - voltar ao corredor.");
        escolha1 = entrada.nextLine();
        System.out.println("");
        if (escolha1.contains("1")) {
            System.out.println("Ao acender a luz você vê um espelho, uma forma negra passa atrás de você, porém você não conseque se mecher...");
            System.out.println("");
            System.out.println("No espelho você vê a senhora que ajudou anteriormente, vocês estão sentados juntos em uma sala pequena, comfortável."
                    + "\nEla te oferece chá e biscoitos, você se vê tomando, antes de a visão desaparecer, a última cena é você caindo para frente e alguém te segurando."
                    + "\n> 1 - voltar ao corredor.");
            escolha2 = entrada.nextLine();
            System.out.println("");
            quarto6(escolha4);
        } else {
            quarto6(escolha4);
        }
        return escolha4;
    }

    public static String quarto9(int N) {
        String escolha1, escolha2 = "", palavra = "", escolha3 = "", escolha4 = "";

        System.out.println("Quando você toca na porta ela se abre com um click, na penumbra você vê um sofá e uma mesa, ao fundo uma porta."
                + "\n> 1 - examinar a mesa"
                + "\n> 2 - voltar ao corredor"
                + "\n> 3 - abrir a porta");
        escolha1 = entrada.nextLine();
        System.out.println("");
        if (escolha1.contains("1")) {

            System.out.println("Na mesa há um jogo de chá, você percebe que esta na temperatura ideal para degustar, junto com uma chave."
                    + "\n> 1 - tomar o chá"
                    + "\n> 2 - pegar a chave");
            escolha3 = entrada.nextLine();
            System.out.println("");
            if (escolha3.contains("1")) {
                System.out.println("Você ouve uma risada de deboche antes de perder a consciencia"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "\n");
                quarto1();
            } else {
                System.out.println("A chave parece estar quente na sua mão, você ouve um barulho atrás de você, algo se aproximando rapidamente da sua posição."
                        + "\n> 1 - sair da casa");
                escolha4 = entrada.nextLine();
                palavra = "1";
                porta(palavra);
            }
        } else if (escolha1.contains("2")) {
            quarto6(escolha4);
        } else {
            palavra = "2";
            porta(palavra);
        }
        return escolha4;
    }

    public static void porta(String N) {
        if (N.contains("1")) {
            System.out.println("Ao sair pela porta você reaparece no museu, a pintura na sua frente esta rasgada.");
        } else if (N.contains("2")) {
            System.out.println("A porta esta trancada.");
        }
    }

    public static int jogoDaForca01(String N) {
        boolean venceu = false;
        int jogo = 0;

        String x, palavra = N;
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
            x = entrada.nextLine();
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
        if (venceu = true) {
            jogo = 1;
        } else {
            jogo = 0;
        }
        return jogo;
    }

    public static int HP(String N) {
        int HP = 100, HP1, HPL;

        if (N == " ") {
            HP1 = 0;
        } else {
            HP1 = Integer.parseInt(N);
        }
        HP = HP + HP1;
        return HP;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String dado1 = "", dado4 = " ";
        int dado2 = 0, dado3 = 0;

        dado1 = quarto1();
        dado2 = quarto2(dado1);
        dado3 = quarto6(dado4);
    }
}
