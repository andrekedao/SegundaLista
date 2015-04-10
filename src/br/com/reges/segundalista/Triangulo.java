package br.com.reges.segundalista;


import java.util.Scanner;

/**
 * Classe que modela a fun��o de ler tr�s valores que formam um tri�ngulo e classificar se o mesmo �
 * equil�tero, is�sceles ou escaleno.
 * 
 * @author Andr� Candioto
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
				System.out.println("Tri�ngulo EQUIL�TERO");
			else if (pos1 != pos2 && pos1 != pos3 && pos2 != pos3)
				System.out.println("Tri�ngulo ESCALENO");
			else
				System.out.println("Tri�ngulo IS�SCELES");

		} catch (NumberFormatException e) {
			System.err
					.println("[ERRO] O Valor Informado N�o � um N�mero Real.");
		} finally {
			teclado.close();
		}
	}
}

