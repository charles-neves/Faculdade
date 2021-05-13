package exerciciosLista4;

import java.util.Scanner;

public class List4Ex7 {

	public static void main(String[] args) {
		
//		Em uma papelaria, at� 100 folhas, a 
//		c�pia custa R$0,25, e acima de 100 folhas 
//		custa R$0,20. Dado o total de c�pias, 
//		informe o total a ser pago.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------\n   PAPELARIA SORRISO   \n-----------------------");
		System.out.println("\nQuantas c�pias vc vai precisar? ");
		int copias = sc.nextInt();
		double custo = 0;
		
		if (copias > 100){
			custo = copias * 0.20;	
		}else if (copias <= 100){
			custo = copias * 0.25;
		}
		
		System.out.printf("O custo Total da suas c�pias � de %.2f",(custo));
	}

}
