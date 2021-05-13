package exerciciosLista7;

import java.util.Random;

public class List7Ex3 {

	public static void main(String[] args) {
		// Ler duas vetor A e B de 4 elementos cada.
		// Construir um vetor C, sendo este a jun��o das duas outras vetor.
		// Desta forma, C dever� ter o dobro de elementos, ou seja, 8.

		Random grd = new Random();
		
		int[] A = new int[4];
		int[] B = new int [4];
		
		int[] C = new int [A.length + B.length];
		
		int i = 0;
		
		while(i < A.length) {
			A[i] = grd.nextInt(); //gerou um valor para A[i]
			C[i] = A[i];         // passou A[i] para C[i]
		i++;
		}
		i = 0;
		
		while(i < B.length) {
			B[i] = grd.nextInt();
			C[i + B.length] = B[i]; //gerou um valor para B[i]
			// 'C' esta somando a posi��o i com o tamanho de B[] para continuar adicionando valores as posi��es
		i++;
		}
		
		for (int listC : C ) {  //foreach para exibir conteudo da Array C
			System.out.println(listC);
		}
		
	}

}
