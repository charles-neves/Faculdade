package exercicios;

import java.util.Scanner;

public class List2Ex2 {

	public static void main(String[] args) {
		
		//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as notas de todos os 4 Bimestres");
		System.out.println("1º Bimestre");
		double bim1 = sc.nextDouble();
		System.out.println("2º Bimestre");
		double bim2 = sc.nextDouble();
		System.out.println("3º Bimestre");
		double bim3 = sc.nextDouble();
		System.out.println("4º Bimestre");
		double bim4 = sc.nextDouble();
		
		double media = (bim1 + bim2 + bim3 + bim4 )/ 4;
		
		System.out.printf("A sua média é %.2f", media);
		
		
	}

}
