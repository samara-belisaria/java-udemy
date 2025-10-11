# 🍔 Projeto: Cálculo Conta Restaurante

Este projeto foi desenvolvido durante o curso de **Java na Udemy**.

O programa lê o código e a quantidade de um item consumido em um restaurante, calcula o valor total a pagar com base em uma tabela de preços fixa e exibe o resultado formatado.

---

## 🎯 Objetivo

Praticar o uso de condicionais múltiplas com `if`, `else if`, `else`, além de aplicar operadores aritméticos, entrada de dados com `Scanner` e formatação com `printf`.

---

## 📘 Conceitos Praticados

- Entrada de dados com `Scanner`
- Estrutura condicional encadeada (`if-else if-else`)
- Operações aritméticas simples (multiplicação)
- Impressão com formatação (`System.out.printf`)
- Uso de `Locale.US` para padronização do separador decimal

---

## 🧪 Exemplo de Entrada e Saída

### ✅ Entrada:
3
2

### ✅ Saída:
Total: 10.00

---

## 💻 Código Principal

```java
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
```

---

## 📌 Status do Projeto
- ✅ Finalizado

## 📚 Curso
- Java COMPLETO: Programação Orientada a Objetos + Projetos (Udemy)

## 💻 Tecnologias Utilizadas
- Java • Locale • System.out.printf 

---

## ⚙️ Como Executar

```bash
1. Copie o código abaixo para um arquivo chamado TabelaQte.java
2. Compile com: javac TabelaQte.java
3. Execute com: java TabelaQte
