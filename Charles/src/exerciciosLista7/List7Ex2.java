package exerciciosLista7;

import java.util.Arrays;
import java.util.Random;

public class List7Ex2 {

	public static void main(String[] args) {
		
		// Ler dois vetores A e B com 20 elementos.
		// Construir um vetor C, sendo este formado
		// pelos elementos de A subtra�dos dos elementos de B.
		
		Random gerador = new Random();
		
		int max = 20;
		
		int[] A = new int[max];
		int[] B = new int[max];
		int[] C = new int[max];
		
		
		for (int i = 0; i < max; i++) {
			A[i]=gerador.nextInt(100);
			B[i]=gerador.nextInt(100);
	
			C[i]= A[i] - B[i];
		}
		System.out.println("\nVetor A "+ Arrays.toString(A));
		System.out.println("\nVetor B "+ Arrays.toString(B));
		System.out.println("        --------------------------------------------------------------------------------");
		System.out.println("\nVetor C "+ Arrays.toString(C));
	}

}
