package exerciciosLista6;

public class List6Ex4 {

	public static void main(String[] args) {
		// Fa�a um programa que imprima na tela apenas os n�meros 
		// �mpares entre 1 e 50.

	System.out.println("Todos os n�meros impares de 1 � 50");
		
		int cont = 50;
		int i = 0;
		
		while(i <= cont) {
			if(i % 2 == 1){
				System.out.println(i);
			}
		i++;
		}
		
	}

}
