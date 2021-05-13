package exerciciosLista4;

import java.util.Scanner;

public class List4Ex4 {

	public static void main(String[] args) {
		
//		Em uma f�brica, uma m�quina precisa de manuten��o sempre que o 
//		n�mero de pe�as defeituosas supera 10% da produ��o. 
//		Dados o total de pe�as produzidas e o total de 
//		pe�as defeituosas, informe se a m�quina precisa de manuten��o.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de pe�as Produzidas\n");
		int production = sc.nextInt();
		
		System.out.println("Digite o n�mero de pe�as com defeito\n");
		int numPecasDef = sc.nextInt();
		
		
		if (numPecasDef > (production*0.10)) {
			System.out.println("A m�quina precisa de manuten��o.");
		}
		else {
			System.out.println("A m�quina ainda n�o precisa de manuten��o.");
		}
	}

}
