package br.com.reges.segundalista;

import java.util.Scanner;

/**
 * Classe que modela dois números inteiros e informa qual é o maior
 * 
 * @author Andre Candioto
 *
 */


public class NumeroMaior {
	
	private static Scanner numero;

	public static void main (String[] args) {
	numero = new Scanner(System.in);
	
	/**
	 * Construtor recebendo os campos
	 * 
	 * @param Primero Numero 
	 * @param Segundo Numero 
	 */
				
	System.out.println("Digite o Primero Numero ");
	int a = Integer.parseInt(numero.nextLine());
	
	System.out.println("Digite o Segundo Numero ");
	int b = Integer.parseInt(numero.nextLine());
	/**
	 * Teste Booleano de True ou False
	 */
	
	boolean amaiorqueb = (a > b);
	
	
	/**
	 * Retorna o resultado
	 * 
	 * @return ""O primeiro número é o maior " caso o primeiro número informado seja maior que o segundo
	 *         <p>
	 *         ""O segundo número é o maior " caso o segundo número informado seja maior que o primeiro
	 */

	if(amaiorqueb){  
        System.out.println("O primeiro número é o maior = " + a );
			}else{  
				System.out.println("O segundo número é o maior = " + b);  
            	}  
		}
}
