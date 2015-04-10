package br.com.reges.segundalista;

import java.util.Scanner;

/**
 * Classe que modela dois números inteiros e os mostra em ordem crescente
 * 
 * @author Andre Candioto
 *
 */


public class OrdemCrescente {
	
	int A;
	int B;
	static int aux;
	
	private static Scanner numero;

	public static void main (String[] args) {
	numero = new Scanner(System.in);
	
	/**
	 * Construtor recebendo os campos
	 * 
	 * @param Numero A 
	 * @param Numero B 
	 */
				
	System.out.println("Digite o Numero A ");
	int A = Integer.parseInt(numero.nextLine());
	
	System.out.println("Digite o Numero B ");
	int B = Integer.parseInt(numero.nextLine());
		
	/**
	 * Retorna o resultado
	 * 
	 * @return Ordem Crescente de A e B
	 */

	if(A > B) {  
        aux = A;  
        A = B;  
        B = aux;} 
	
	System.out.println("Ordem Crescente: A = " + A + " e B = " + B + " " );
			
		}
}


