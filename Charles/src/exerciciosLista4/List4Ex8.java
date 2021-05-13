package exerciciosLista4;

import java.util.Scanner;

public class List4Ex8 {

	public static void main(String[] args) {

		//		Crie um programa que receba o valor de total de 
		//		venda de um pedido. E Caso o pagamento for a vista 
		//		(Desconto de 5%), se pagamento for Cart�o D�bito 
		//		(Valor sem desconto), se pagamento for em Cheque (Acr�scimo de 10%)

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Loja do bairro\n");
		System.out.println("Qual o valor total da compra? ");
		double compra = sc.nextDouble();
		double desconto = 0;
		System.out.println("Qual o meio de pagamento voc� vai utilizar?\n"
				+ " use 'V' para pagamento a vista\n"
				+ " use 'D' para pagamento com cart�o de d�bito\n"
				+ " use 'C' para pagamento com cheque");
		String pag = sc.next();
		
		if (pag.equalsIgnoreCase("V")) {
			desconto = compra * 0.05;
			System.out.printf("O custo total da compra � de R$%.2f \n",(compra));
			System.out.printf("Voc� recebera um desconto de R$%.2f \n",(desconto));
			System.out.printf("Seu pagamento dever� ser de R$%.2f \n", (compra-desconto));
			
		}else if (pag.equalsIgnoreCase("D")) {
			desconto = 0;
			System.out.printf("O custo total da compra � de R$%.2f \n",(compra));
			System.out.printf("Voc� recebera um desconto de R$%.2f \n",(desconto));
			System.out.printf("Seu pagamento dever� ser de R$%.2f \n", (compra));

		}else if (pag.equalsIgnoreCase("C")) {
			desconto = compra * 0.10;
			System.out.printf("O custo total da compra � de R$%.2f \n",(compra));
			System.out.printf("O seu custo ter� um acr�scimo de R$%.2f \n",(desconto));
			System.out.printf("Seu pagamento dever� ser de R$%.2f \n", (compra+desconto));
		}else {
			System.out.println("Sele��o de pagamento incorreta!");
		}
		
	}

}
