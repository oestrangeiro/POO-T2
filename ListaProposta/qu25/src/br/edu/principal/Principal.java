package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de horas extras que o funcionário trabalhou: ");
		double he = sc.nextDouble();
		System.out.println("Digite o número de horas que o funcionário faltou: ");
		double hf = sc.nextDouble();
		double H = (he) -  2/3 * (hf);
		
		if (H>2400) {
			System.out.println("A gratificação será R$500,00.");
		}
		else if (H>1800 && H<=2400) {
			System.out.println("A gratificação será R$400,00");
		}
		else if (H>1200 && H<=1800) {
			System.out.println("A gratificação será R$300,00");
		}
		else if (H>600 && H<=1200) {
			System.out.println("A gratificação será R$200,00");
		}
		else if (H<600) {
			System.out.println("A gratificação será R$100,00");
		}
	}

}
