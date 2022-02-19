/*
 Duas palavras podem ser consideradas anagramas de si mesmas
 se as letras de uma palavra podem ser realocadas para formar a outra palavra.
 Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

 Exemplo:
 	Entrada
 		ovo
 		
 	Saída
 		3
 
 	Entrada
 		ifailuhkqq
 	
 	Saída
 		3
 * */

package desafio.capgemini.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Questao03 {

	public static void main(String[] args) {
		String palavra = "ovo"; //ifailuhkqq
		
		System.out.println(anagrama(palavra));
	}
	
	public static int anagrama(String palavra) {
		int quantidadeDePares = 0;
		int parAtual = 1;
		
		Map<String, Integer> map = new HashMap<>();
		
		while(parAtual != palavra.length()) {
			for(int i = 0; i < palavra.length(); i++) {
				if((i + parAtual) <= palavra.length()) {
					
					String substring = palavra.substring(i, i + parAtual);
					char[] caracteres = substring.toCharArray();
					Arrays.sort(caracteres);
					String caracteresOrdenados = String.valueOf(caracteres);
					if(map.containsKey(caracteresOrdenados)) {
						map.put(caracteresOrdenados, map.get(caracteresOrdenados) + 1);
					}
					else {
						map.put(caracteresOrdenados, 1);
					}
				}
			}
			parAtual++;
		}
		
		for(Entry<String, Integer> dados : map.entrySet()) {
			quantidadeDePares += dados.getValue()*(dados.getValue()-1) / 2;
		}
		return quantidadeDePares;
	}
	
}
