package com.unama;

public class Main {

    public static void main(String[] args) {
	Heroi batman = new Heroi();
	batman.setNome("Batman");
	batman.setPeso(81.5);
	batman.setfocaDeAtaque(900);
	batman.imprimirAtributos();

	Heroi superman = new Heroi("Super Homem", 79.6, 900);
	superman.imprimirAtributos();
    }
}
