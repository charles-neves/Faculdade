package exercicios;

import java.util.Scanner;

public class List1Ex4 {
	public static void main(String[] args) {
		
		/*
		 Escrever um algoritmo que l�: 
- a porcentagem do IPI a ser acrescido no valor das pe�as 
- o c�digo da pe�a 1, valor unit�rio da pe�a 1, quantidade de pe�as 1 
- o c�digo da pe�a 2, valor unit�rio da pe�a 2, quantidade de pe�as 2 
O algoritmo deve calcular o valor total a ser pago e apresentar o 
resultado. F�rmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1) 
		 */
		
		
		Scanner sn = new Scanner (System.in);
		System.out.println("");
		System.out.println("Os produtos a serem acrecentados a ");
		System.out.println("seguir s�o acrecidos de um valor de IPI,");
		System.out.println("");
		
		System.out.println("qual a porcentagem do IPI? ");
		float IPI = sn.nextFloat();
		
		System.out.println("");
		System.out.println("PE�A 1");
		System.out.println("");
		System.out.println("Digite os pedidos abaixo");
		System.out.println("");
		
		System.out.println("C�digo da pe�a");
		float codPeca1 = sn.nextFloat();
		
		System.out.println("Valor da pe�a por unidade");
		float valPeca1 = sn.nextFloat();
		
		System.out.println("Quantidade de pe�as");
		float quantPecas1 = sn.nextFloat();
		
		float custPeca1 = quantPecas1 * valPeca1 ;
		
		System.out.println("");
		System.out.println("PE�A 2");
		System.out.println("");
		
		System.out.println("C�digo da pe�a");
		float codPeca2 = sn.nextFloat();
		
		System.out.println("Valor da pe�a por unidade");
		float valPeca2 = sn.nextFloat();
		
		System.out.println("Quantidade de pe�as");
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
