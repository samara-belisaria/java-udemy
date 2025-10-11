package br.com.udemy.lesson;

import java.util.Locale;
import java.util.Scanner;

public class TabelaQte {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int codigo, qte;
		double total; 
		
		codigo = sc.nextInt();
		qte = sc.nextInt();
		
		if (codigo == 1) {
			total = qte * 4.0; 
		}
		else if (codigo == 2) {
			total = qte * 4.50;
		}
		else if (codigo == 3) {
			total = qte * 5.00;
		}
		else if (codigo == 4) {
			total = qte * 2.00;
		}
		else {
			total = qte * 1.50;
		}
		
		System.out.printf("Total: %.2f%n", total);
		
		sc.close();
	}

}
