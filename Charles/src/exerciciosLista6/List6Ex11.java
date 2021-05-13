package exerciciosLista6;

import java.util.Random;
import java.util.Scanner;

public class List6Ex11 {

	public static void main(String[] args) {
	
//	    11. Colocar estas duas linhas iniciais no m�todo Main(): 
//	    	Random rnd = new Random(); 
//	    	//Inicia Aleat�rio int x = rnd.nextInt(100); 
//	    	//Gera um n�mero aleat�rio (0 � 99) 
//	    	    a) Fa�a um la�o de repeti��o que solicite ao usu�rio
//				digitar um n�mero;
//	    	    b) O la�o encerra quando o usu�rio acertar o n�mero; 
//	    	    c) Se o n�mero do usu�rio for menor que o oculto, 
//				escrever: �MAIOR�, se o n�mero do usu�rio for maior que o oculto, 
//				escrever: �MENOR�.
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int x = rnd.nextInt(100);
		int num = 0;
		
		System.out.println("Digite um n�mero de 0 � 99");
		num = sc.nextInt();
		
		while(x != num) {
						
			if (x > num){
				System.out.println("Digite um n�mero maior");
				num = sc.nextInt();
			}
			if (x < num) {
				System.out.println("Digite um n�mero menor");
				num = sc.nextInt();
			}
			
		}
		
		System.out.println("Parab�ns!!! Voc� acertou");
		
	}

}
