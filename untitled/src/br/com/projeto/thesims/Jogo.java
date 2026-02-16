package br.com.projeto.thesims;

public class Jogo {
    private int dia;


    public void iniciarJogo(){
        dia = 1;
    }

    public int passarDia(){
         dia++;
         return dia;
    }

    public void mostarDia(){
        System.out.println("Esta no dia: " + this.dia);
    }
}
