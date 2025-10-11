# 🧮 Projeto: Múltiplos

Este projeto foi desenvolvido durante o curso de **Java na Udemy**.  
O programa solicita dois números inteiros e verifica se eles são múltiplos entre si, imprimindo uma resposta adequada ao usuário.

---

## 🎯 Objetivo

Praticar o uso de **operadores aritméticos**, **entrada de dados com Scanner** e **condicionais if/else** para verificar múltiplos.  
O foco do exercício é desenvolver a lógica de verificação de múltiplos entre dois valores.

---

## 📘 Conceitos Praticados

- Entrada de dados com `Scanner`
- Operador aritmético `%` (módulo)
- Estrutura condicional `if / else`
- Impressão de mensagens com `System.out.println`

---

## 📝 Exemplo de Entrada e Saída

✅ **Entrada:**
6
24

✅ **Saída:**
SÃO MULTIPLOS

---

## 💻 Código Principal

```java
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
```

---

## 📌 Status do Projeto
- ✅ Finalizado

## 📚 Curso
- Java COMPLETO: Programação Orientada a Objetos + Projetos (Udemy)

## 💻 Tecnologias Utilizadas
- Java • Scanner • System.out.printf • Operador módulo (%) • Estrutura condicional if/else

---

## ⚙️ Como Executar

```bash
1. Copie o código abaixo para um arquivo chamado Multiplos.java
2. Compile com: javac Multiplos.java
3. Execute com: java Multiplos
