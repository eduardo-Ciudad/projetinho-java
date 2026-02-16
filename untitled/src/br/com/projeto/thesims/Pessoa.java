package br.com.projeto.thesims;

public class Pessoa {
    private String nome;
    private int energia;
    private int fome;
    private int felicidade;
    private double dinheiro;
    private int inteligencia;


    public Pessoa(String nome) {
        this.nome = nome;
        energia = 70;
        fome = 40;
        felicidade = 60;
        dinheiro = 50;
        inteligencia = 10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public int getFome() {
        return fome;
    }

    public int getFelicidade() {
        return felicidade;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void comer(){
        if (dinheiro < 10){
            System.out.println("Você não tem dinheiro para comprar comida!");
            return;
        }

        energia += 10;
        fome -= 30;
        felicidade += 5;
        dinheiro -= 10;
        corrigirStatus();
    }

    public void dormir(){
        energia += 40;
        fome +=10;
        corrigirStatus();
    }

    public void trabalhar(){
        energia -= 20;
        fome += 20;
        felicidade -= 10;
        dinheiro += 50;
        corrigirStatus();
    }

    public void estudar(){
        energia -= 15;
        fome += 10;
        felicidade -= 5;
        inteligencia += 10;
        corrigirStatus();
    }

    public void jogar(){
        energia -= 10;
        fome += 5;
        felicidade += 20;
        corrigirStatus();
    }

    private int limitar(int valor) {
        if (valor < 0) return 0;
        if (valor > 100) return 100;
        return valor;
    }

    private void corrigirStatus() {
        energia = limitar(energia);
        fome = limitar(fome);
        felicidade = limitar(felicidade);
        inteligencia = limitar(inteligencia);
    }

    public boolean estaVivo(){

        if (energia <= 0){
            System.out.println("Você morreu de exaustão!");
            return false;
        }

        if (fome >= 100){
            System.out.println("Você morreu de fome!");
            return false;
        }

        if (felicidade <= 0){
            System.out.println("Você morreu de depressão!");
            return false;
        }

        return true;
    }
}
