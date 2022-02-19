package desafio.capgemini.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import desafio.capgemini.model.Questao01;

class Questao01Test {
	
	@Test
	void test() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		
		Questao01.main(null);
		
		String textoEsperado = "     *\n    **\n   ***\n  ****\n *****\n******\n";
		
		Assertions.assertEquals(textoEsperado, outputStream.toString());
	}
}
