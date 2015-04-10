package br.com.reges.segundalista;
import java.util.Scanner;

/**
 * Classe que modela Numeros Iguais informando a partir da 
 * digitação de dois números se são iguais ou diferentes
 * 
 * @author Andre Candioto
 *
 */


public class NumerosIguais {
	
	private static Scanner numero;

	public static void main (String[] args) {
	numero = new Scanner(System.in);
	
	/**
	 * Construtor recebendo os campos
	 * 
	 * @param primeiro numero
	 * @param segundo numero
	 */
				
	System.out.println("Digite o Primeiro Numero");
	int i = Integer.parseInt(numero.nextLine());
	
	System.out.println("Digite o Segundo Numero");
	int j = Integer.parseInt(numero.nextLine());
	
	/**
	 * Retorna o resultado da comparação
	 * 
	 * @return "Os Números são Iguais" caso sejam iguais
	 *         <p>
	 *         "Os Números são Diferentes" caso sejam diferentes
	 */
		
	if (i == j) { 		
		
		System.out.println("Os Números são Iguais");
	
		} else {
	
	System.out.println("Os Números são Diferentes");
		
	}
	}

}
	

	
		
	
	
	
	
	

