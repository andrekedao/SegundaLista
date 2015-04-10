package br.com.reges.segundalista;


import java.util.Scanner;

/**
 * Classe que modela o teste se o um número digitado está compreendido entre 20 e 90 ou não
 * 
 * @author André Candioto
 * 
 */
public class NumeroVinteANoventa {
/**
* Exercicio 10 - Programa que tem a função de verificar se um número está ou não
* compreendido entre 20 e 90.
* 
* @param args
*            Argumentos
*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("Informe um número");
			double num = Double.parseDouble(teclado.nextLine());

			if (num > 20 && num < 90)
				System.out.println("O Número Está Entre 20 e 90.");
			else
				System.out.println("O Número Não Está Entre 20 e 90.");
		} catch (Exception ex) {
			System.err
					.println("[ERRO] O Valor Informado Não é um Número. Favor Informar outro valor. ");
		} finally {
			teclado.close();
		}
	}
}

