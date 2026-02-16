package br.com.projeto.thesims;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pobrexinho");
        Scanner sc = new Scanner(System.in);
        Jogo jogo = new Jogo();
        jogo.iniciarJogo();

        while (pessoa.estaVivo()) {
            System.out.println("Energia: " + pessoa.getEnergia());
            System.out.println("Fome: " + pessoa.getFome());
            System.out.println("Felicidade: " + pessoa.getFelicidade());
            System.out.println("Dinheiro: " + pessoa.getDinheiro());
            System.out.println("Inteligência: " + pessoa.getInteligencia());

            System.out.println("\n1 Comer");
            System.out.println("2 Dormir");
            System.out.println("3 Trabalhar");
            System.out.println("4 Estudar");
            System.out.println("5 Jogar");
            System.out.println("6 Sair");
            System.out.print("Escolha: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    pessoa.comer();
                    break;
                case 2:
                    pessoa.dormir();
                    break;
                case 3:
                    pessoa.trabalhar();
                    break;
                case 4:
                    pessoa.estudar();
                    break;
                case 5:
                    pessoa.jogar();
                    break;
                case 6:
                    System.out.println("Você desistiu da vida...");
                    return;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            jogo.passarDia();
        }
    }
}
