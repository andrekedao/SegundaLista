package br.com.reges.segundalista;

import java.util.Scanner;

/**
 * Classe que modela dois n�meros inteiros e informa qual � o maior
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
	 * @return ""O primeiro n�mero � o maior " caso o primeiro n�mero informado seja maior que o segundo
	 *         <p>
	 *         ""O segundo n�mero � o maior " caso o segundo n�mero informado seja maior que o primeiro
	 */

	if(amaiorqueb){  
        System.out.println("O primeiro n�mero � o maior = " + a );
			}else{  
				System.out.println("O segundo n�mero � o maior = " + b);  
            	}  
		}
}
