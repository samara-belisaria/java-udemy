# 🧮 Projeto: Soma Simples

Este é um dos primeiros exercícios desenvolvidos durante o curso de **Java** na **Udemy**.  
O programa realiza a leitura de dois números inteiros e exibe a soma dos valores informados.

---

## 🎯 Objetivo
Praticar conceitos básicos de **entrada e saída de dados**, **operações matemáticas simples** e uso da classe **Scanner** em Java.

---

## 🧠 O que foi praticado

Leitura de dados com Scanner

Tipos primitivos (int)

Operações matemáticas básicas

Exibição formatada no console

## 📥 Exemplo de Entrada e Saída

Entrada:

10  
30

Saída:

X = 40

---

## 💻 Código Principal

```java
import java.io.IOException;
import java.util.Scanner;

public class SomaX {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A, B, X;

        A = sc.nextInt();
        B = sc.nextInt();

        X = A + B;

        System.out.println("X = " + X);

        sc.close();
    }
}
