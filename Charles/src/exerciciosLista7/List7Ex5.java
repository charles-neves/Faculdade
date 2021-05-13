package exerciciosLista7;

import java.util.Arrays;
import java.util.Random;

public class List7Ex5 {

	public static void main(String[] args) {
		// Criar um vetor A e B, R.
		// Somar o valor do vetor A com o vetor B e
		//	armazenar o resultado no vetor R.
		
		
Random gerador = new Random();
		
		int max = 20;
		
		int[] A = new int[max];
		int[] B = new int[max];
		int[] R = new int[max];
		
		
		for (int i = 0; i < max; i++) {
			A[i]=gerador.nextInt(100);
			B[i]=gerador.nextInt(100);
	
			R[i]= A[i] + B[i];
		}
		System.out.println("\nVetor A "+ Arrays.toString(A));
		System.out.println("\nVetor B "+ Arrays.toString(B));
		System.out.println("        --------------------------------------------------------------------------------");
		System.out.println("\nVetor R "+ Arrays.toString(R));

	}

}
