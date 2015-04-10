package br.com.reges.segundalista;

import java.util.*; 

/**
 * Classe que modela um n�mero inteiro digitado informando se � par ou �mpar
 *  
 * @author Andre Candioto
 *
 */

public class NumeroParImpar { 


public static void main (String args []){ 
	@SuppressWarnings("resource")
Scanner teclado = new Scanner(System.in); 

/**
 * Construtor recebendo o campo
 * 
 * @param numero
 */

System.out.print("Informe um numero: ");
int num1 = Integer.parseInt(teclado.nextLine());

/**
 * Retorna o resultado da compara��o
 * 
 * @return "O N�mero � par" caso seja um n�mero par
 *         <p>
 *         "O N�mero � impar" caso seja um n�mero impar
 */

if (num1 % 2 == 0) 
System.out.println("O N�mero � par !"); 
else 
System.out.println("O N�mero � impar !");	

} 

}