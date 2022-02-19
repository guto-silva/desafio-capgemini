package desafio.capgemini.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import desafio.capgemini.model.Questao02;

class Questao02Test {

	@Test
	void testaCaracteresQueFaltamParaTamanhoMinimoDaSenha() {
		String senha = "Yab";
		int valorEsperado = Questao02.numeroDeCaracteres(senha);
		
		Assertions.assertEquals(3, valorEsperado);	
	}

	
}
