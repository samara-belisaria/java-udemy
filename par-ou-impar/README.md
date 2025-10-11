# 🧮 Projeto: Par ou Ímpar

Este projeto foi desenvolvido durante o curso de **Java na Udemy**.  
O programa lê um número inteiro informado pelo usuário e verifica se ele é **par** ou **ímpar**, exibindo a mensagem correspondente.

---

## 🎯 Objetivo

Praticar o uso de **estruturas condicionais (if e else)** e o operador **módulo (%)** para verificar a paridade de um número inteiro.  
Além disso, exercitar a **entrada de dados** utilizando a classe `Scanner` e o **uso de operadores relacionais** em expressões simples.

---

## 📘 Conceitos Praticados

- Estruturas condicionais (`if`, `else`)
- Operador módulo (`%`)
- Declaração e leitura de variáveis inteiras (`int`)
- Entrada de dados com a classe `Scanner`
- Impressão de mensagens com `System.out.println`

---

## ✏️ Exemplo de Entrada e Saída

### ✅ **Entrada:**
12

### 🖥️ **Saída:**
PAR

---

### ✅ **Entrada:**
-27

### 🖥️ **Saída:**
IMPAR

---

## 💻 Código Principal

```java
import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
```

---

## 📌 Status do Projeto
- ✅ Finalizado

## 📁 Curso
- Java COMPLETO Programação Orientada a Objetos + Projetos (Udemy)

## 💻 Tecnologias Utilizadas
- Java • Scanner • System.out.printf • Operadores condicionais

---

## ⚙️ Como Executar

```bash
1. Copie o código abaixo para um arquivo chamado Par.java
2. Compile com: javac Par.java
3. Execute com: java Par
