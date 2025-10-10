package br.com.udemy.lesson;

import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero; 
		
		System.out.println("Digite o número: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("NÂO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
	}
		
		sc.close();
	}
}
