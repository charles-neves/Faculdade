package exerciciosLista5;

import java.util.Scanner;

public class List5Ex2 {
	public static void main(String[] args) {
//	Escrever um programa de computador que leia 10 n�meros 
//	inteiros e, ao final, apresente a soma de todos os n�meros lidos
	
	Scanner sc = new Scanner(System.in);
	
	int i = 1;
	int soma = 0;
	int num = 1;

	while (i <= 10) {
		System.out.println("digite um n�mero inteiro ");
		num = sc.nextInt();
		if (num >= 0) {
			soma += num;
			i++;
			}
		}
	System.out.println("a soma de todos os n�meros digitados � = "+ soma);
	}
}

