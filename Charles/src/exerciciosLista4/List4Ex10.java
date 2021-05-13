package exerciciosLista4;

import java.util.Scanner;

public class List4Ex10 {

	public static void main(String[] args) {

//	    10. Faça um Programa que peça os 3 lados de um triângulo.
//          O programa deverá informar se os valores podem ser um triângulo. 
//          Indique, caso os lados formem um triângulo, 
//  		se o mesmo é: equilátero, isósceles ou escaleno.
//        ◦ Dicas:
//        ◦ Três lados formam um triângulo quando a soma de quaisquer 
//  		dois lados for maior que o terceiro;
//        ◦ Triângulo Equilátero: três lados iguais;
//        ◦ Triângulo Isósceles: quaisquer dois lados iguais;
//        ◦ Triângulo Escaleno: três lados diferentes;

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é o tipo de triangulo que você tem?");
		
		System.out.println("\nQual é o tamanho do primeiro lado do triângulo?");
		double lado1 = sc.nextDouble();
		
		System.out.println("\nQual é o tamanho do segundo lado do triângulo?");
		double lado2 = sc.nextDouble();
		
		System.out.println("\nQual é o tamanho do terceiro lado do triângulo?");
		double lado3 = sc.nextDouble();
		
		if ((lado1 > lado2 + lado3)||(lado2 > lado3 + lado1)||(lado3 > lado2 + lado1)) {
			System.out.println("Essas medidas não formam um triangulo");
			
		}else if ((lado1 == lado2) && (lado3 == lado1)){
		System.out.println(" Este é um Triângulo Equilátero ");	
			
		}else if ((lado1 == lado2) || (lado3 == lado1) || (lado3 == lado2)) {
			System.out.println("Este é um Triângulo Isósceles ");
			
		}else if ((lado1 != lado2)&&(lado2 != lado3)&&(lado3 != lado1)) {
			System.out.println("Este é um triangulo Escaleno");
		}
	}

}
