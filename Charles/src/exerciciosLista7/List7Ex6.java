package exerciciosLista7;

import java.util.Arrays;
import java.util.Random;

public class List7Ex6 {

	public static void main(String[] args) {
		// 6. Escrever um algoritmo que l� um vetor N(10) e o escreve.
		// Encontre, a seguir, o menor elemento e a sua posi��o no vetor N e escreva:
		// "O menor elemento de N � = ... e a sua posi��o � ... "
		Random grd = new Random();

		int[] N = new int[10];
		int menor = 10001; //menor inicia maior que o maximo gerado no random
		int posicao = 0;
		int i = 0;
		
		while( i < N.length) {
			N[i] = grd.nextInt(10000);

			if (menor >= N[i]) {
				menor = N[i];     //substituindo o menor na variavel
				posicao = i;	  // posi��o do menor numero 	
			}
			i++;
		}
		System.out.println(Arrays.toString(N)); // exibir array para conferencia
		System.out.println("\nO menor elemento de N � = " + menor + "... e a sua posi��o � ... " + posicao);
	}

}
