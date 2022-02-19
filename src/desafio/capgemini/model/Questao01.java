/*
 # Questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
A base e altura da escada devem ser iguais ao valor de n.
A última linha não deve conter nenhum espaço.

Exemplo:
	Entrada:
		n = 6
		
	Saída:
			 *
			**
		   ***
		  ****
		 *****
		******
 * */

package desafio.capgemini.model;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int	n = leia.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			
			for(int l = 1; l <= i; l++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		
		leia.close();
	}

}
