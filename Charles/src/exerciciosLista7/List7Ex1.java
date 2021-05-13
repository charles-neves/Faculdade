package exerciciosLista7;

import java.util.Arrays;
import java.util.Random;

public class List7Ex1 {

	public static void main(String[] args) {
		// Desenvolva um programa que efetue a
		// leitura de 10 elementos para um vetor A e 
		// apresente no final a somat�ria dos elementos �mpares.

		// Scanner sc = new Scanner(System.in);
		
		int[] A = new int[10];
		
		int somaImp = 0;
		
		Random gerador = new Random();
		
		for (int i = 0 ; i < A.length; i++) {
			A[i] = gerador.nextInt(50);
	
			if(A[i] % 2 != 0){
				 somaImp += A[i];
			 }
			
		}
		System.out.println("Vetor A "+ Arrays.toString(A) );

		System.out.println("A soma dos elementos �mpares � " + somaImp);
	}

}
