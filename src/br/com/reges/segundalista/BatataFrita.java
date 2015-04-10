package br.com.reges.segundalista;

import java.util.Scanner;

/**
 * Classe que modela o teste de senha "batatafrita" com mensagem ao usuário 
 * 
 * @author Andre Candioto
 *
 */

public class BatataFrita {
	
	
		public static void main(String[]arg){

			@SuppressWarnings("resource")
			  Scanner teclado = new Scanner(System.in);
			
			/**
			 * Construtor recebendo o campo
			 * 
			 * @param senha
			 *  
			 */

			  System.out.println("Digite sua senha ");
			  String senha = teclado.nextLine();
			  
			  /**
				 * Retorna o resultado da validação da senha digitada
				 * 
				 * Foi utilizado switch case
				 * 
				 * @return Acesso permitido ou negado
				 */

			  
			  switch (senha) {
			  case "batatafrita":
			  System.out.println("Acesso permitido");
			  break;
			  default:
			  System.out.println("Voce não tem acesso ao sistema");
				
			  } 
		}
}

	
	
	
