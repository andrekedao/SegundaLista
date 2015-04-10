package br.com.reges.segundalista;

import java.util.Scanner;

/**
 * Classe que modela dois números inteiros A e B e informa se A é divisível por B
 * 
 * @author Andre Candioto
 *
 */


public class Divisivel {
	
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
	 * Teste Booleano de True ou False
	 */
	
	boolean AdivisivelB = (A%B == 0);
	
	/**
	 * Retorna o resultado
	 * 
	 * @return "A é Divisivel por B " caso A seja divisivel por B
	 *         <p>
	 *         "A não é divisivel por B " caso A não seja divisivel por B
	 */

	if(AdivisivelB){  
        System.out.println("A é Divisivel por B ");
	}else{  
            System.out.println("A não é divisivel por B ");  
            }  
	}
}
     
	
        