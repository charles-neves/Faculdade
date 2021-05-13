package exercicios;

import java.util.Scanner;

public class List1Ex4 {
	public static void main(String[] args) {
		
		/*
		 Escrever um algoritmo que lê: 
- a porcentagem do IPI a ser acrescido no valor das peças 
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1 
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2 
O algoritmo deve calcular o valor total a ser pago e apresentar o 
resultado. Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1) 
		 */
		
		
		Scanner sn = new Scanner (System.in);
		System.out.println("");
		System.out.println("Os produtos a serem acrecentados a ");
		System.out.println("seguir são acrecidos de um valor de IPI,");
		System.out.println("");
		
		System.out.println("qual a porcentagem do IPI? ");
		float IPI = sn.nextFloat();
		
		System.out.println("");
		System.out.println("PEÇA 1");
		System.out.println("");
		System.out.println("Digite os pedidos abaixo");
		System.out.println("");
		
		System.out.println("Código da peça");
		float codPeca1 = sn.nextFloat();
		
		System.out.println("Valor da peça por unidade");
		float valPeca1 = sn.nextFloat();
		
		System.out.println("Quantidade de peças");
		float quantPecas1 = sn.nextFloat();
		
		float custPeca1 = quantPecas1 * valPeca1 ;
		
		System.out.println("");
		System.out.println("PEÇA 2");
		System.out.println("");
		
		System.out.println("Código da peça");
		float codPeca2 = sn.nextFloat();
		
		System.out.println("Valor da peça por unidade");
		float valPeca2 = sn.nextFloat();
		
		System.out.println("Quantidade de peças");
		float quantPecas2 = sn.nextFloat();
		
		float custPeca2 = quantPecas2 * valPeca2 ;
		
		
		System.out.println("----------------------------------");
		System.out.println("TOTAL DA COMPRA ");
		System.out.println("");
		System.out.println("PRODUTO 1");
		System.out.println("");
		System.out.println("O CUSTO TOTAL FOI DE: "+ custPeca1 );
		System.out.println("");
		System.out.println("PRODUTO 2");
		System.out.println("");
		System.out.println("O CUSTO TOTAL FOI DE: "+ custPeca2 );
		System.out.println("----------------------------------");
		System.out.println("TOTAL DOS PRODUTOS COM IPI " + (custPeca1 + custPeca2)*(IPI/100 + 1) );
		System.out.println("----------------------------------");
		
		
		
		
		
		
	}
	

}
