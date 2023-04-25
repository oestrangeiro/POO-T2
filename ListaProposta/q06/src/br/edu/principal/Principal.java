package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		float num1;
		float num2;
		int selecao;
		float resultado;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextFloat();
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextFloat();
		
		System.out.println("\nEscolha a operação que deseja fazer digitando \"1\", \"2\" ou \"3\": ");
		System.out.println("1. Média entre dois números");
		System.out.println("2. Diferença do maior pelo menor");
		System.out.println("3. O produto entre os dois números");
		selecao = sc.nextInt();
		
	  System.out.println("\n");
		if (selecao == 1) {
			resultado = (num1 + num2)/2;
			System.out.println("A média entre os dois número é: " + resultado);
		} else if (selecao == 2) {
			if (num1 > num2) {
				resultado = num1 - num2;
				System.out.println("A diferença do maior número pelo menor número é: " + resultado);
			} else if (num1 < num2) {
				resultado = num2 - num1;
				System.out.println("A diferença do maior número pelo menor número é: " + resultado);
			} else if (num1 == num2) {
				resultado = num1 - num2;
				System.out.println("A diferença do maior número pelo menor número é: " + resultado);
			}
		} else if (selecao == 3) {
			resultado = num1 * num2;
			System.out.println("O produto entre os dois números é: " + resultado);
		} else {
			System.out.println("Você não selecionou uma opção válida.");
		}
		

		}
}
