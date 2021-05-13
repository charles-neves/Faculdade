package exerciciosLista6;

import java.util.Scanner;

public class List6Ex9 {

	public static void main(String[] args) {
		//     9. Dados um capital, uma taxa de juros mensal e um per�odo em meses,
		//     informe o montante ao final de cada m�s. 
//		O programa deve funcionar como a seguir: 
//			Capital? 100.00 
//			Juros? 10 							
//			Per�odo? 3 
//			1� m�s R$ 110,00 
//			2� m�s R$ 121,00 						
//			3� m�s R$ 133,10

		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		System.out.println("Digite o valor total a ser investido ");
		double capital = sc.nextDouble();
		
		System.out.println("Digite os Juros do investimento ");
		double juros = sc.nextDouble();
		
		System.out.println("Digite a quantidade de meses de investimento ");
		int meses = sc.nextInt();
		
		
		while(i <= meses) {
			double montante = capital + (capital * (juros/100));
			System.out.printf(i+"� m�s R$ %.2f ", montante);
			System.out.println(""); 
			capital = montante;
		i++;
		}
		
	}

}
