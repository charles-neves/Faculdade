package exerciciosLista4;

import java.util.Scanner;

public class List4Ex9 {

	public static void main(String[] args) {

		//		A Loja Mam�o com A��car est� vendendo seus 
        //		produtos em 5 (cinco) presta��es sem juros 
		//		para compras acima de R$250,00. Fa�a um algoritmo que 
		//		receba um valor de uma compra e mostre o valor das 
		//		presta��es se poss�vel.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("   ------------------------\n"
				         + "   Loja do Mam�o com A��car\n"
				         + "   ------------------------\n");
		System.out.println("Qual o valor total da compra? ");
		double compra = sc.nextDouble();
		System.out.println("... An�lisando sua compra ...  ...");
		
		if(compra > 250) {
			System.out.println("Sua compra pode ser parcelada em at� 5x s/ juros\n");
			System.out.println("Quantas presta��es voc� deseja fazer seu pagamento?");
			int prestacoes = sc.nextInt();
			switch(prestacoes) {
			case 1:
				double parcela = compra / prestacoes; 
				System.out.println("seu pagamento ser� feito em "+ prestacoes+ "x sem juros");
				System.out.printf(" e o valor da parcela ser� de R$%.2f",(parcela));
				break;
				
			case 2:
				double parcela1 = compra / prestacoes; 
				System.out.println("seu pagamento ser� feito em "+ prestacoes+ "x sem juros");
				System.out.printf(" e o valor da parcela ser� de R$%.2f",(parcela1));
				break;
				
			case 3:
				double parcela2 = compra / prestacoes; 
				System.out.println("seu pagamento ser� feito em "+ prestacoes+ "x sem juros");
				System.out.printf(" e o valor da parcela ser� de R$%.2f",( parcela2));
				break;
				
			case 4:
				double parcela3 = compra / prestacoes; 
				System.out.println("seu pagamento ser� feito em "+ prestacoes+ "x sem juros");
				System.out.printf(" e o valor da parcela ser� de R$%.2f",( parcela3));
				break;
				
			case 5:	
				double parcela4 = compra / prestacoes; 
				System.out.println("seu pagamento ser� feito em "+ prestacoes + "x sem juros");
				System.out.printf(" e o valor da parcela ser� de R$%.2f",( parcela4));
				break;
			default:
				System.out.println("ERRO - quantidade n�o dispon�vel");
			}
			
		}else {
			System.out.printf("\nSua compra n�o atingiu o valor minimo para parcelamento\ntotal da a pagar %.2f",(compra));
		}
		
		
		
	}

}
