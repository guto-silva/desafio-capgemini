/*
 Débora se inscreveu em uma rede social para se manter em contato com seus amigos.
 A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte.
 O site considera uma senha forte quando ela satisfaz os seguintes critérios:
 
    • Possui no mínimo 6 caracteres.
    • Contém no mínimo 1 digito.
    • Contém no mínimo 1 letra em minúsculo.
    • Contém no mínimo 1 letra em maiúsculo.
    • Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
    
 Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte.
 Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem
 ser adicionados para uma string qualquer ser considerada segura.
 
 Exemplo
 
 	Entrada: Ya3
 	
 	Saída: 3
 */

package desafio.capgemini.model;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Questao02 {
	static int TAMANHO_MINIMO = 6;
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String senha = leia.nextLine();
		
		
		try {
			if(numeroDeCaracteres(senha) < 6) {
				System.out.println(TAMANHO_MINIMO - numeroDeCaracteres(senha));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		leia.close();
	}
	
	@Test
	public static int numeroDeCaracteres (String senha) {
		
		return senha.length();
		
	}

}
