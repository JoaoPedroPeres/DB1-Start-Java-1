package com.db1.db1start;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Esta eh a adicao dos numeros:" + Funcoes.adicao(3,5));
		System.out.println("Esta eh a subtracao dos numeros:" + Funcoes.subtracao(85, 32));
		System.out.println(Funcoes.maiusculo("este caso esta em maiusculo"));
		System.out.println(Funcoes.minusculo("este caso esta em minusculo"));
		System.out.println("Este eh o menor entre os dois numeros: " + Funcoes.menorEntreDois(8.6245, 7.3254));
		System.out.println("este eh o menor entre os tres numeros: " + Funcoes.menorEntreTres(6.5984, 1.6542, 9.5684));
	}
} 
