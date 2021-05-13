package exercicios;

import java.util.Scanner;

public class List2Ex3 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		//Faça um Programa que converta metros para centímetros.
		
		System.out.println("Digite uma quantidade de metros para ser convertida em centímetros");
		System.out.println("");
		
		double metros = sn.nextDouble();
		int centimetros = (int) (metros * 100);
		
		System.out.println("\n Esta quantidade de metros: " + metros + "\n corresponde a: " + centimetros + " centimetros");
		
				

	}

}
