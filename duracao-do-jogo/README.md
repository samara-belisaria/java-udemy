# 🎮 Projeto: Duração do Jogo

Este projeto foi desenvolvido durante o curso de **Java na Udemy**.  
O programa recebe dois valores inteiros representando o horário inicial e final de um jogo, e calcula sua duração em horas, considerando a virada de dia se necessário.

---

## 🎯 Objetivo

Praticar o uso de **condicionais (`if`, `else`)**, **operações com valores inteiros** e a **lógica de cálculo de intervalo de tempo** com base em horas.

---

## 📘 Conceitos Praticados

- Leitura de dados com a classe `Scanner`
- Estruturas condicionais (`if` / `else`)
- Lógica de subtração e contorno de limite de 24 horas
- Impressão formatada com `System.out.println`

---

## 🧪 Exemplo de Entrada e Saída

### ✅ Entrada:
16
2

### ✅ Saída:
O JOGO DUROU 10 HORA(S)

---

## 💻 Código Principal

```java
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
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}
}
```

---

## 📌 Status do Projeto
- ✅ Finalizado

## 📚 Curso
- Java COMPLETO: Programação Orientada a Objetos + Projetos (Udemy)

## 💻 Tecnologias Utilizadas
- Java • Scanner • System.out.println • Condicionais (if, else)

---

## ⚙️ Como Executar

```bash
1. Copie o código abaixo para um arquivo chamado Game.java
2. Compile com: javac Game.java
3. Execute com: java Game
