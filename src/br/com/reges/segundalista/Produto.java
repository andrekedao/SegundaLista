package br.com.reges.segundalista;

import java.util.Scanner;

/**
* Classe que modela o pre�o de venda de um produto, caso o pre�o de compra for menor que R$ 20,00
* acrescentar 45% caso contr�rio 30%
* 
* @author Andr� Candioto
* 
*/
public class Produto {
/**
* 
* 
* @param args
*            Argumentos
*/
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o valor da Compra");
		double preco = Double.parseDouble(teclado.nextLine());
		if (preco < 20.0)
			preco *= 1.45;
		else
			preco *= 1.30;
			System.out.println(String.format("O pre�o de venda � R$ %.2f.",preco));
			
	}
}