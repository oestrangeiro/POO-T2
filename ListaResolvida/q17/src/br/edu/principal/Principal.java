package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("| RESOLVEDOR DE EQUAÇÃO DO SEGUNDO GRAU |");
		System.out.printf("+---------------------------------------+ %n%n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("A SEGUIR, ENTRE COM OS VALORES DA FÓRMULA 'ax^2 + bx + c = 0, onde a != 0%n");
		double a, b, c, delta, x1, x2;
		System.out.printf("Entre com o valor de 'a': %n");
		a = sc.nextDouble();
		System.out.printf("Entre com o valor de 'b': %n");
		b = sc.nextDouble();
		System.out.printf("Entre com o valor de 'c': %n");
		c = sc.nextDouble();
		System.out.printf("VALORES DIGITADOS: A - %s; B - %s; C - %s%n", a, b, c);
		
		delta = 0;
		
		if(a == 0) {
			System.out.print("ESTES VALORES NÃO FORMAM UM EQUAÇÃO DO SEGUNDO GRAU!%n");
			
		}else {
			delta = (b * b) - (4 * a * c);
				if(delta < 0) {
					System.out.println("NÃO EXISTE RAIZ REAL!");
				}
		}		
				if(delta == 0) {
					System.out.println("EXISTE RAIZ REAL!");
					x1 = -b / (2 * a);
					System.out.printf("A RAIZ É: %s", x1);
			}
				
				if(delta > 0) {
					System.out.println("EXISTEM DUAS RAIZES REAIS!");
					x1 = (-b + (Math.sqrt(delta))) / (2 * a);
					x2 = (-b - (Math.sqrt(delta))) / (2 * a);
					
					System.out.printf("As raizes são: %s e %s", x1, x2);
		}
	}
				
}
