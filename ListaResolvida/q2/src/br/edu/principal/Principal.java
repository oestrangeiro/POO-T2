package br.edu.principal;
import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		float n1, n2, n3 = 0;
		double media = 0;
		
		System.out.println("-------------------------");
		System.out.println("SISTEMA DE NOTAS DO IFCE!");
		System.out.println("-------------------------\n");
		System.out.println("Seja bem-vindo!\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("ATENÇÃO: UTILIZE ',' AO INVÉS DE '.'");
		System.out.println(" (EX.: 7.3 -> 7,3)");
		System.out.println("Por favor, informe a nota 1:");
		n1 = sc.nextFloat();
		
		System.out.println("Por favor, informe a nota 2:");
		n2 = sc.nextFloat();
		
		System.out.println("Por favor, informe a nota 3:");
		n3 = sc.nextFloat();
		sc.close();
		
		System.out.printf("ATENÇÃO, AS NOTAS INFORMADAS FORAM: %s, %s e %s. \n", n1, n2, n3);
		
		
		media = (n1 + n2 + n3)/3;
		
		if((media >= 0) && (media < 3)) {
		
			System.out.println("ALUNO REPROVADO!");
			System.out.println("Média: " + media);
			
		}else if((media >= 3) && (media < 7)) {
			
			System.out.println("ALUNO COM DIREITO A EXAME!");
			System.out.println("Média: " + media);
			
		}else if((media >= 7) && (media <= 10 )) {
			
			System.out.println("ALUNO APROVADO!");
			System.out.printf("Média: %.2f ", media);
			
		}
	}

}
