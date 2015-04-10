package br.com.reges.segundalista;

import java.util.Scanner;

/**
 * Classe que modela a situa��o do Aluno se Aprovado, Reprovado por Faltas, Reprovado por M�dia 
 * ou Reprovado por Faltas e  M�dia.
 * 
 * @author Andr� Candioto
 * 
 */
public class SituacaoAluno {
	
		
	public static void main(String[]arg){
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		/**
		 * Nome do Aluno
		 */
		String nome ="Andre Candioto";
		/**
		 * Primeira Nota
		 */
		Double Nota1;
		/**
		 * Segunda Nota
		 */
		Double Nota2;
		/**
		 * Terceira Nota
		 */
		Double Nota3;
		/**
		 * M�dia Aritm�tica das tr�s notas
		 */
		Double Media;
		/**
		 * Quantidade de Faltas
		 */
		int QuantFalta;
		/**
		 * Quantidade de Aulas com valor fixo = 80
		 */
		int QuantAula = 80;
		/**
		 * Percentual permitido para Faltas
		 */
		int PercFalta = 25;
						
		System.out.println("Digite a primeira nota:");
		Nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a segunda nota:");
		Nota2 = Double.parseDouble(teclado.nextLine());
        System.out.println("Digite a terceira nota:");
		Nota3 = Double.parseDouble(teclado.nextLine());
        System.out.println("Digite a quantidade de faltas:");
		QuantFalta = Integer.parseInt(teclado.nextLine());
		/**
		 * M�todo que calcula a m�dia a partir das tr�s notas
		 */
		
		Media = (Nota1 + Nota2 + Nota3)/3;
		/**
		 * Informa o Nome do Aluno
		 */
		System.out.println("O Aluno " + nome +  " foi: " );
		/**
		 * Valida��o do Resultado imprimindo na tela o Retorno
		 */
		if  (Media < 7.0 && QuantFalta > (QuantAula * PercFalta)/100){
		    System.out.println("Reprovado por M�dia e Faltas");
	}
		else if (QuantFalta > (QuantAula * PercFalta)/100) {
				System.out.println("Reprovado por Falta");
			}
		else if (Media < 7.0){
			    System.out.println("Reprovado por M�dia");
		}
		else {
				System.out.println("Aprovado");
			}
		
		}

}
	