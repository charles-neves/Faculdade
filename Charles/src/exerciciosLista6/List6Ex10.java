package exerciciosLista6;

import java.util.Random;
import java.util.Scanner;

public class List6Ex10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Random n = new Random();
		
	//  	  Fa�a um programa que pe�a para n pessoas a sua idade,
	//	   	ao final o programa devera verificar se a m�dia de idade
	//		da turma varia entre 0 e 25, 26 e 60 e maior que 60;
	//		e ent�o, dizer se a turma � jovem, adulta ou idosa,
	//		conforme a m�dia calculada.

	
/* deixei "n" como um numero entre 10 e 25 pra gerar um grupo de um tamanho bom mas n�o t�o longo  */
		int pessoas = n.nextInt((25 - 10)+ 1 )+ 10;
		int idade = 0;
		int idadeSoma = 0;
		
		System.out.println("Temos um grupo com "+pessoas+" pessoas\n");
		
		for (int i = 1; i <= pessoas; i++) {
			System.out.println("Digite a idade da "+i+"� pessoa ");
			idade = sc.nextInt();
			idadeSoma += idade; 
		}
		
		double media = (idadeSoma / pessoas);
		
		if(media <= 25) {
			System.out.println("O grupo de pessoas tem a m�dia de idade de "+ media + " e se classifica como Jovem");
		}else if((media > 25) && (media < 60)) {
			System.out.println("O grupo de pessoas tem a m�dia de idade de "+ media + " e se classifica como Adulto");
		}else if(media > 60) {
			System.out.println("O grupo de pessoas tem a m�dia de idade de "+ media + " e se classifica como Idoso");
		}
	
	}

}
