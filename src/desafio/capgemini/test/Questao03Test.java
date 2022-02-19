package desafio.capgemini.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import desafio.capgemini.model.Questao03;

class Questao03Test {

	@Test
	void test() {
		String palavra = "ifailuhkqq";
		int quantidadeDeParesDeSubstrings = Questao03.anagrama(palavra);
		
		Assertions.assertEquals(3, quantidadeDeParesDeSubstrings);
	}

}
