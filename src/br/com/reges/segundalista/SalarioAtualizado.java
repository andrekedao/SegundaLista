package br.com.reges.segundalista;

import java.util.Scanner;

/**
* Classe que modela a atualização do salário conforme tabela pré-estabelecida. Conforme tabela salário até
* R$ 600,00 aumento de 30%, de R$ 600,01 a R$ 1100,00 aumento de 25%, de R$ 1100,01 a R$ 2400,00 aumento
* de 20%, R$ 2400,01 a R$ 3550,00 aumento de 15% e mais que R$ 3550,00 aumento de 10%.
* 
* 
* @author André Candioto
* 
*/
public class SalarioAtualizado {
/**
* 
* 
* @param args
*            Argumentos
*/
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o Valor do Salário a ser atualizado");
		double salario = Double.parseDouble(teclado.nextLine());
		/**
		 * Método para calcular o percentual de aumento no salário informado
		 */
		if (salario <= 600.0)
			salario *= 1.30;
		else if (salario > 600.0 && salario <= 1100.0)
			salario *= 1.25;
		else if (salario > 1100.0 && salario <= 2400.0)
		    salario *= 1.20;
		else if (salario > 2400.0 && salario <= 3550.0)
			salario *= 1.15;
		else salario *= 1.10;
			System.out.println(String.format("O Salário atualizado R$ %.2f.",salario));
			
	}
}
