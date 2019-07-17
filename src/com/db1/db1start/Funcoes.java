package com.db1.db1start;

public class Funcoes {

	public static int adicao(int numeroA, int numeroB) {
		int sum;
		sum=numeroA+numeroB;
		return sum;
	}
	public static int subtracao(int numeroA, int numeroB) {
		int subtracao;
		subtracao=numeroA-numeroB;
		return subtracao;
	}
	public static String maiusculo(String palavra) {
		if(palavra!=null) {
			String maiusculo = palavra.toUpperCase();
			return maiusculo;
		}
		return "nao ha string";
	}
	public static String minusculo(String palavra) {
		if(palavra!=null) {
			return palavra.toLowerCase();
		}
		return "nao ha string";
	}
	public static double menorEntreDois(double numeroA, double numeroB) {
		if(numeroA<numeroB) {
			return numeroA;
		}else if(numeroB<numeroA) {
			return numeroB;
		}else {
			return numeroA;
		}
	}
	public static double menorEntreTres(double numeroA, double numeroB, double numeroC) {
		if(numeroA<numeroB && numeroA<numeroC) {
			return numeroA;
		}else if(numeroB<numeroA && numeroB<numeroC) {
			return numeroB;
		}else if(numeroC<numeroA && numeroC<numeroB) {
			return numeroC;
		}else if(numeroA==numeroB && numeroA<numeroC) {
			return numeroA;
		}else if(numeroB==numeroC && numeroA<numeroA) {
			return numeroB;
		}else if(numeroC==numeroA && numeroA<numeroB) {
			return numeroA;
		}else {
			return numeroA;
		}
	}
}
