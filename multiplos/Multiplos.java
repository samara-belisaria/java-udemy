package br.com.udemy.lesson;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A, B; 
	
		System.out.println("Digite o primeiro número: ");
		A = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("SÃO MULTIPLOS");
		}
		else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		
		sc.close();

	}

}
