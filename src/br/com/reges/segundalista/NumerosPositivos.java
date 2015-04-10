package br.com.reges.segundalista;


import java.util.Scanner;
import java.util.Arrays;

/**
 * Classe que modela o teste de ler tr�s n�meros positivos e escreve-los em ordem crescente 
 * 
 * @author Andre Candioto
 *
 */
public class NumerosPositivos {
/**
 * 
 * 
 * @param N�mero
 * @param positiveNumber
 * @return Double
 * @throws NegativeException
 */
	public static double positiveNumber(double num) throws NegativeArraySizeException {
		if (num < 0)
			throw new NegativeArraySizeException();
		else
			return num;
	}
	/**
	 * 
	 * 
	 * @param args
	 *            Argumentos
	 */

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			double[] num = new double[3];

			System.out.println("Digite o primeiro n�mero:");
			num[0] = positiveNumber(Double.parseDouble(teclado.nextLine()));

			System.out.println("Digite o segundo n�mero:");
			num[1] = positiveNumber(Double.parseDouble(teclado.nextLine()));

			System.out.println("Digite o terceiro n�mero:");
			num[2] = positiveNumber(Double.parseDouble(teclado.nextLine()));

			
			Arrays.sort(num);

			System.out.println(String.format(
					"Lista de N�meros Ordenada: \n%.2f\n%.2f\n%.2f", num[0],
					num[1], num[2]));
		} catch (NegativeArraySizeException e) {
			System.err.println("[ERRO] O N�mero N�o Pode Ser Negativo.");
		} catch (NumberFormatException e) {
			System.err.println("[ERRO] O Valor Informado N�o � um N�mero.");
		} finally {
			teclado.close();
		}
	}
}
