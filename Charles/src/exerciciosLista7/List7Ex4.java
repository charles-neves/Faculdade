package exerciciosLista7;

import java.util.Arrays;

public class List7Ex4 {

	public static void main(String[] args) {
		// Dados dois vetores X, Y com 3 palavras,
		// construa um terceiro vetor R com essas 6 palavras.
		
		String[] X = {"Casa", "Carro","Carteira"};
		String[] Y = {"rato", "pato","cabra"};
		
		String[] R = new String [6];
		
		int i = 0;
		
		while(i < X.length) {
			R[i] = X[i];
		i++;
		}
		i = 0;
		
		while(i < Y.length) {
			R[i + X.length] = Y[i];
		i++;
		}
		
		for (String item : R) {
			System.out.println(item);
		}
		//System.out.println(" Array A" + Arrays.toString(R));
	}

}
