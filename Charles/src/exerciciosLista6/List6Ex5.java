package exerciciosLista6;

public class List6Ex5 {

	public static void main(String[] args) {
		// Informar todos os n�meros de 1000 a 1999 
		// que quando divididos por 11 obtemos resto = 5. 
		
System.out.println("Todos os n�meros de 1000 a 1999 divididos por 11 com resto 5");
		
		int cont = 1999;
		int i = 1000;
		
		while(i <= cont) {
			if(i % 11 == 5){
				System.out.println(i);
			}
		i++;
		}

	}

}
