package exerciciosLista7;


import java.util.Scanner;

public class List7Ex7 {

	public static void main(String[] args) {
		// Construa uma aplica��o que recebe uma quantidade 
		// indeterminada de n�meros inteiros e conte quantos deles
		// est�o nos seguintes intervalos:  [1-25], [26-50], [51-75] e [76-100].
		// A entrada de dados dever� terminar quando for lido o n�mero 0.

		


		Scanner sc = new Scanner(System.in); 
		
		int qtd1a25  = 0;
		int qtd26a50  = 0;
		int qtd51a75  = 0;
		int qtd76a100  = 0;
		int n = 0;
		do{
			System.out.println("Entre com um numero de 1 a 100\nou entre com 0 para sair");
			 n = sc.nextInt();
			if(n >= 1 && n <= 25) {
				qtd1a25++;
			}else if(n >= 26 && n <= 50) {
				qtd26a50++;
			}else if(n >= 51 && n <= 75) {
				qtd51a75++;
			}else if(n >= 76 && n <= 100) {
				qtd76a100++;
			}else if(n < 0) {
				System.out.println("numero digitado menor que 0,");
			}else if(n > 100) {
				System.out.println("numero digitado maior que 100,");
			}
			
		}while(n != 0);
			System.out.println("[1-25] -> "+qtd1a25);
			System.out.println("[26-50] -> "+qtd26a50);
			System.out.println("[51-75] -> "+qtd51a75);
			System.out.println("[76-100] -> "+qtd76a100);
		
	}
}