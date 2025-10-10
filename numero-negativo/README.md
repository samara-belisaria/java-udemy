# 🧮  Projeto: Número Negativo

Este projeto foi desenvolvido durante o curso de Java na **Udemy**.  
O programa recebe um número inteiro e verifica se ele é **negativo** ou **não negativo**, utilizando estruturas condicionais simples.

---

## 🎯 Objetivo

Praticar o uso de **estruturas condicionais (if-else)** com variáveis inteiras.  
Também reforçar a leitura de dados com a classe `Scanner` e a estrutura básica de um programa Java.

---

## 📘 Conceitos Praticados

- Leitura de dados com `Scanner`
- Estrutura condicional `if-else`
- Impressão de mensagens com `System.out.println`
- Lógica booleana para tomada de decisão
- Encerramento de fluxo com `Scanner.close()`

---

## ✏️ Exemplo de Entrada e Saída
#### ✅ **Entrada:**

-10

#### ✅ **Saída:**

NEGATIVO

#### ✅ **Entrada:**

8

#### ✅ **Saída:**

NÃO NEGATIVO

---

## 🔢 Código Principal

```java
import java.util.Scanner;

public class Negativo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número: ");
        numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("NÃO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
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
- Java • Scanner • System.out.printf • if-else

---

## ⚙️ Como Executar

```bash
1. Copie o código abaixo para um arquivo chamado Negativo.java
2. Compile com: javac Negativo.java
3. Execute com: java Negativo
