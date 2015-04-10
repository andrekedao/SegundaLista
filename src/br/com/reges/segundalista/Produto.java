package br.com.reges.segundalista;

import java.util.Scanner;

/**
* Classe que modela o preço de venda de um produto, caso o preço de compra for menor que R$ 20,00
* acrescentar 45% caso contrário 30%
* 
* @author André Candioto
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
			System.out.println(String.format("O preço de venda é R$ %.2f.",preco));
			
	}
}