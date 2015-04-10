package br.com.reges.segundalista;


import java.util.Scanner;

/**
 * Classe que modela a função de ler três valores que formam um triângulo e classificar se o mesmo é
 * equilátero, isósceles ou escaleno.
 * 
 * @author André Candioto
 * 
 */
public class Triangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("Digite o valor para o primeiro ponto:");
			double pos1 = Double.parseDouble(teclado.nextLine());

			System.out.println("Digite o valor para o segundo ponto:");
			double pos2 = Double.parseDouble(teclado.nextLine());

			System.out.println("Digite o valor para o terceiro ponto:");
			double pos3 = Double.parseDouble(teclado.nextLine());

			if (pos1 == pos2 && pos1 == pos3 && pos2 == pos3)
				System.out.println("Triângulo EQUILÁTERO");
			else if (pos1 != pos2 && pos1 != pos3 && pos2 != pos3)
				System.out.println("Triângulo ESCALENO");
			else
				System.out.println("Triângulo ISÓSCELES");

		} catch (NumberFormatException e) {
			System.err
					.println("[ERRO] O Valor Informado Não é um Número Real.");
		} finally {
			teclado.close();
		}
	}
}

