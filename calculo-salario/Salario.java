package br.com.udemy.lesson;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		int fun, num; 
		double horas, resultado;
		
		fun = sc.nextInt();
		num = sc.nextInt();
		horas = sc.nextDouble();
		
		resultado = num * horas; 
		
		System.out.println("NUMBER = " + fun);
		System.out.printf("SALARY = U$ %.2f%n", resultado);
		
		sc.close();

	}

}
