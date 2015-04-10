package br.com.reges.segundalista;

import java.util.*; 

/**
 * Classe que modela um número inteiro digitado informando se é par ou ímpar
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
 * Retorna o resultado da comparação
 * 
 * @return "O Número é par" caso seja um número par
 *         <p>
 *         "O Número é impar" caso seja um número impar
 */

if (num1 % 2 == 0) 
System.out.println("O Número é par !"); 
else 
System.out.println("O Número é impar !");	

} 

}