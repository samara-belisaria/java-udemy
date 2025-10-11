package br.com.udemy.lesson;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int horaI, horaF, duracao;
		
		horaI = sc.nextInt();
		horaF = sc.nextInt();
		
		if (horaI < horaF) {
			duracao = horaF - horaI;
		}
		else {
			duracao = 24 - horaI + horaF;
		}
		
		System.out.println("O JOGO DUROU " + duracao + "HORA(S)");
		
		sc.close();

	}

}
