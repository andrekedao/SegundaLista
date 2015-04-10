package br.com.reges.segundalista;


import java.util.Scanner;

/**
 * Classe que modela o teste se o um n�mero digitado est� compreendido entre 20 e 90 ou n�o
 * 
 * @author Andr� Candioto
 * 
 */
public class NumeroVinteANoventa {
/**
* Exercicio 10 - Programa que tem a fun��o de verificar se um n�mero est� ou n�o
* compreendido entre 20 e 90.
* 
* @param args
*            Argumentos
*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("Informe um n�mero");
			double num = Double.parseDouble(teclado.nextLine());

			if (num > 20 && num < 90)
				System.out.println("O N�mero Est� Entre 20 e 90.");
			else
				System.out.println("O N�mero N�o Est� Entre 20 e 90.");
		} catch (Exception ex) {
			System.err
					.println("[ERRO] O Valor Informado N�o � um N�mero. Favor Informar outro valor. ");
		} finally {
			teclado.close();
		}
	}
}

