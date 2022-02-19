package desafio.capgemini.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Questao02Test {

	@Test
	void testaCaracteresQueFaltamParaTamanhoMinimoDaSenha() {
		int tamanhoMinimo = 6;
		int numeroDeCaracteres = 3;
		
		Assertions.assertEquals(3, tamanhoMinimo - numeroDeCaracteres);	
	}
}
