package br.com.reges.segundalista;

import java.util.Scanner;

/**
 * Classe que modela dois n�meros inteiros A e B e informa se A � divis�vel por B
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
	 * @return "A � Divisivel por B " caso A seja divisivel por B
	 *         <p>
	 *         "A n�o � divisivel por B " caso A n�o seja divisivel por B
	 */

	if(AdivisivelB){  
        System.out.println("A � Divisivel por B ");
	}else{  
            System.out.println("A n�o � divisivel por B ");  
            }  
	}
}
     
	
        