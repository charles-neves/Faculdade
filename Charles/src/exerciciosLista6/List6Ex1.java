package exerciciosLista6;

public class List6Ex1 {

	public static void main(String[] args) {
		
//		Fa�a um programa que imprima todos 
//		os n�mero pares entre 0 e 100. 
		
		System.out.println("Todos os n�meros pares de 0 � 100");
		
		int cont = 100;
		int i = 0;
		
		while(i <= cont) {
			if(i % 2 == 0){
				System.out.println(i);
			}
		i++;
		}
		
	}

}
