package exercicios;

import java.util.Scanner;

public class List2Ex2 {

	public static void main(String[] args) {
		
		//Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as notas de todos os 4 Bimestres");
		System.out.println("1� Bimestre");
		double bim1 = sc.nextDouble();
		System.out.println("2� Bimestre");
		double bim2 = sc.nextDouble();
		System.out.println("3� Bimestre");
		double bim3 = sc.nextDouble();
		System.out.println("4� Bimestre");
		double bim4 = sc.nextDouble();
		
		double media = (bim1 + bim2 + bim3 + bim4 )/ 4;
		
		System.out.printf("A sua m�dia � %.2f", media);
		
		
	}

}
