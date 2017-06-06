/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_tads_pi1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Red
 */
public class jogodavelha {

    public String[][] jogodavelha = new String[3][3];

    public boolean jogadaMaquina() {

        //GERAR COMANDOS PARA TESTAR SE A POSIÇÃO DO RANDOM É VÁLIDA, SE SIM, A POSIÇÃO SERÁ ESCOLHIDA!
        Random jogador2 = new Random();
        boolean validacao = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (jogodavelha[i][j] == null) {
                    jogodavelha[i][j] = "-";
                }

            }

        }

        int sorteio = jogador2.nextInt(8) + 1;

        switch (sorteio) {
            case 1:
                if (jogodavelha[0][0].equals("-")) {
                    jogodavelha[0][0] = "o";
                    validacao = true;
                } else {
                    validacao = false;
                }
                break;
            case 2:
                if (jogodavelha[0][1].equals("-")) {
                    jogodavelha[0][1] = "o";
                    validacao = true;
                }
                break;
            case 3:
                if (jogodavelha[0][2].equals("-")) {
                    jogodavelha[0][2] = "o";
                    validacao = true;
                }
                break;
            case 4:
                if (jogodavelha[1][0].equals("-")) {
                    jogodavelha[1][0] = "o";
                    validacao = true;
                }
                break;
            case 5:
                if (jogodavelha[1][1].equals("-")) {
                    jogodavelha[1][1] = "o";
                    validacao = true;
                }
                break;
            case 6:
                if (jogodavelha[1][2].equals("-")) {
                    jogodavelha[1][2] = "o";
                    validacao = true;
                }
                break;
            case 7:
                if (jogodavelha[2][0].equals("-")) {
                    jogodavelha[2][0] = "o";
                    validacao = true;
                }
                break;
            case 8:
                if (jogodavelha[2][1].equals("-")) {
                    jogodavelha[2][1] = "o";
                    validacao = true;
                }
                break;
            case 9:
                if (jogodavelha[2][2].equals("-")) {
                    jogodavelha[2][2] = "o";
                    validacao = true;
                }
                break;

        }
        return true;
    }

    public int checagem() {
        int x = 0;
        boolean checagem = false;
        if (jogodavelha[0][0] == "x" && jogodavelha[0][1] == "x" && jogodavelha[0][2] == "x" || jogodavelha[1][0] == "x" && jogodavelha[1][1] == "x" && jogodavelha[1][2] == "x" || jogodavelha[2][0] == "x" && jogodavelha[2][1] == "x" && jogodavelha[2][2] == "x") {
            checagem = true;
            System.out.println("Você ganhou o jogo!");
        } else if (jogodavelha[0][0] == "o" && jogodavelha[0][1] == "o" && jogodavelha[0][2] == "o" || jogodavelha[1][0] == "o" && jogodavelha[1][1] == "o" && jogodavelha[1][2] == "o" || jogodavelha[2][0] == "o" && jogodavelha[2][1] == "o" && jogodavelha[2][2] == "o") {
            checagem = true;
            System.out.println("Você perdeu o jogo!");
        } else if (jogodavelha[0][0] == "x" && jogodavelha[1][1] == "x" && jogodavelha[2][2] == "x" || jogodavelha[0][2] == "x" && jogodavelha[1][1] == "x" && jogodavelha[2][0] == "x") {
            checagem = true;
            System.out.println("Você ganhou o jogo!");
        } else if (jogodavelha[0][0] == "o" && jogodavelha[1][1] == "o" && jogodavelha[2][2] == "o" || jogodavelha[0][2] == "o" && jogodavelha[1][1] == "o" && jogodavelha[2][0] == "o") {
            checagem = true;
            System.out.println("Você perdeu o jogo!");
        } else if (jogodavelha[0][0] == "x" && jogodavelha[1][0] == "x" && jogodavelha[2][0] == "x" || jogodavelha[0][1] == "x" && jogodavelha[1][1] == "x" && jogodavelha[2][1] == "x" || jogodavelha[0][2] == "x" && jogodavelha[1][2] == "x" && jogodavelha[2][2] == "x") {
            checagem = true;
            System.out.println("Você ganhou o jogo!");
        } else if (jogodavelha[0][0] == "o" && jogodavelha[1][0] == "o" && jogodavelha[2][0] == "o" || jogodavelha[0][1] == "o" && jogodavelha[1][1] == "o" && jogodavelha[2][1] == "o" || jogodavelha[0][2] == "o" && jogodavelha[1][2] == "o" && jogodavelha[2][2] == "o") {
            checagem = true;
            System.out.println("Você perdeu o jogo!");
        }
        if (checagem == false) {
            x = 0;

        } else if (checagem == true) {
            x = 1;
        }

        return x;
    }

    public int main() {
        Scanner leitor = new Scanner(System.in);
        boolean validacao = false;
        int x = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (jogodavelha[i][j] == null) {
                    jogodavelha[i][j] = "-";
                }
            }

        }

        //LAÇO PARA PEDIR A POSIÇÃO PARA O USUÁRIO        
        System.out.println("Você é o X!");
        int p = 0;

        while (p < 9) {
            System.out.println("Informe a posição desejada de 1 a 9: ");
            String posicao = leitor.next();

            //DECISÃO DA IMPRESSÃO CONFORME A POSIÇÃO
            switch (posicao) {
                case "1":
                    if (jogodavelha[0][0].equals("-")) {
                        jogodavelha[0][0] = "x";
                        validacao = true;
                    }
                    break;
                case "2":
                    if (jogodavelha[0][1].equals("-")) {
                        jogodavelha[0][1] = "x";
                        validacao = true;
                    }
                    break;
                case "3":
                    if (jogodavelha[0][2].equals("-")) {
                        jogodavelha[0][2] = "x";
                        validacao = true;
                    }
                    break;
                case "4":
                    if (jogodavelha[1][0].equals("-")) {
                        jogodavelha[1][0] = "x";
                        validacao = true;
                    }
                    break;
                case "5":
                    if (jogodavelha[1][1].equals("-")) {
                        jogodavelha[1][1] = "x";
                        validacao = true;
                    }
                    break;
                case "6":
                    if (jogodavelha[1][2].equals("-")) {
                        jogodavelha[1][2] = "x";
                        validacao = true;
                    }
                    break;
                case "7":
                    if (jogodavelha[2][0].equals("-")) {
                        jogodavelha[2][0] = "x";
                        validacao = true;
                    }
                    break;
                case "8":
                    if (jogodavelha[2][1].equals("-")) {
                        jogodavelha[2][1] = "x";
                        validacao = true;
                    }
                    break;
                case "9":
                    if (jogodavelha[2][2].equals("-")) {
                        jogodavelha[2][2] = "x";
                        validacao = true;
                    }
                    break;

            }
            p = p + 1;
            //COMANDOS DO TABULEIRO
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (jogodavelha[i][j] == null) {
                        jogodavelha[i][j] = "-";
                    }

                    System.out.print(jogodavelha[i][j] + " ");

                }
                System.out.println("");

            }

            jogadaMaquina();
            x = checagem();
            validacao = false;
            if (x == 1) {
                break;
            }

        }
        return x;
    }

}
