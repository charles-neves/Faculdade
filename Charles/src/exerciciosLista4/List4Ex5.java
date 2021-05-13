package exerciciosLista4;

import java.util.Scanner;

public class List4Ex5 {

	public static void main(String[] args) {

//		Fa�a um programa que pergunte o pre�o de tr�s produtos e 
//		informe qual produto voc� deve comprar, 
//		sabendo que a decis�o � sempre pelo mais barato.
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("\nDigite o nome e o valor de tr�s produtos desta loja que mais lhe agradaram,\nPrimeiro produto: ");
		String name1 = sc.next();
		double v1 = sc.nextDouble();

		System.out.println("\n Digite o segundo produto: ");
		String name2 = sc.next();
		double v2 = sc.nextDouble();

		System.out.println("\n Digite o terceiro produto: ");
		String name3 = sc.next();
		double v3 = sc.nextDouble();

		if ((v1 < v2) && (v1 < v3)) {
			System.out.println("\nO(a) "+ name1 + " � o que voc� deve comprar  ");
		} else if ((v2 < v1)&&(v2 < v3)) {
			System.out.println("\nO(a) "+ name2 + " � o que voc� deve comprar  ");
		} else if ((v3 < v1)&&(v3 < v2)) {
			System.out.println("\nO(a) "+ name3 + " � o que voc� deve comprar  ");
		}
			

		if ((v1 == v2)&&(v3==v2)) {
			System.out.println("\nOs pre�os de  " + v1 + " e " + v2 +" e "+ v3 + " s�o iguais ");
		}

	}

}

