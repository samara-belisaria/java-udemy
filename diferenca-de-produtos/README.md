# 💻 Projeto: Diferença de Produtos

Este programa lê quatro valores inteiros (A, B, C e D) e calcula a **diferença entre o produto de A e B e o produto de C e D**.  
O resultado é então exibido na tela.

---

## 🎯 Objetivo
Praticar o uso de **operadores aritméticos** e **entrada de dados** em Java, utilizando a classe `Scanner`.

---

## 🧠 Conceitos abordados
- Declaração e uso de variáveis do tipo `int`
- Operações matemáticas com multiplicação e subtração
- Entrada de dados com `Scanner`
- Exibição de resultados no console com `System.out.println`

---

## 📥 Exemplo de Entrada e Saída

### Entrada:

- 5
- 6
- 7
- 8


### Saída:

- DIFERENÇA = -26


## 💡 Cálculo:
→ (5 × 6) − (7 × 8) = 30 − 56 = −26

---

## 🧩 Código Principal

```java
import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca; 
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = A * B - C * D;
		
		System.out.println("DIFERENÇA = " + diferenca);

		sc.close();
	}
}
