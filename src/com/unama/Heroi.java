package com.unama;

public class Heroi {
     String nome;
    double peso, forcaDeAtaque;

    double atacar() {
        if (this.peso > 100) {
            return 50.50;
        } else {
            return 25.25;
        }
    }
    Heroi() {
        System.out.println("> Criando um objeto através do " + "construtor não parametrizado");
    }
    Heroi(String nome, double peso, double forca){
        this.nome = nome;
        this.peso = peso;
        this.forcaDeAtaque = forca;
    }
    void imprimirAtributos(){
        System.out.println("###################");
        System.out.println("Nome: " +this.nome);
        System.out.println("Peso: " +this.peso);
        System.out.println("Força de ataque: " + this.forcaDeAtaque);
    }
    public void setNome(String nome){
        if(nome.length() >= 1 && nome.length() <= 100) {
            this.nome = nome;
        } else {
         System.err.println("Erro! Nome inválido, precisa" +
                 "conter no minimo um caracter e no máximo" +
                 "100 caracteres");
         System.exit(0);
        }
    }
    public String getNome(){
        return this.nome;
    }
    public void setPeso(double peso){
        if (peso > 0){
            this.peso = peso;
        } else {
            System.err.println("Erro! O peso precisa ser" +
                    "maior que zero");
            System.exit(0);
        }
    }

    public double getForcaDeAtaque() {
        return forcaDeAtaque;
    }

    public void setfocaDeAtaque(int i) {
    }
}
