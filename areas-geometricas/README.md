# 🧮 Projeto: Áreas Geométricas  

Este projeto foi desenvolvido durante o curso de **Java** na **Udemy**.  
O programa recebe três valores e calcula as áreas de diferentes figuras geométricas: **triângulo, círculo, trapézio, quadrado e retângulo**.

---

## 🎯 Objetivo  

Praticar o uso de **variáveis do tipo double**, **constantes**, **operações matemáticas** e **formatação de saída** com `printf`.  
Além disso, exercitar a leitura de dados com a classe **Scanner** e o uso da **classe Locale** para padronização decimal.

---

## 📘 Conceitos Praticados

- Declaração e uso de variáveis double

- Definição de constantes (final)

- Operações matemáticas com múltiplas fórmulas

- Formatação de saída com System.out.printf

- Locale.US para padronizar o separador decimal

- Leitura de dados com a classe Scanner

---

## ✏️ Exemplo de Entrada e Saída
#### ✅ Entrada:
3.0  
4.0  
5.2

#### ✅ Saída:
TRIANGULO: 7.800  
CIRCULO: 84.949  
TRAPEZIO: 18.200  
QUADRADO: 16.000  
RETANGULO: 12.000

---

## 💻 Código Principal  

```java
package br.com.udemy.lesson;

import java.util.Locale;
import java.util.Scanner;

public class Raio {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        final double PI = 3.14159;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        triangulo = (A * C) / 2;
        circulo = PI * C * C;
        trapezio = (A + B) * C / 2; 
        quadrado = B * B;
        retangulo = A * B;
        
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
        
        sc.close();
    }
}
```

## 🛠️ Como Executar

Copie o código acima em um arquivo chamado Raio.java.

Compile com javac Raio.java.

Execute com java Raio e insira os valores conforme o exemplo.

✅ Certifique-se de que o locale do sistema esteja configurado para Locale.US, caso contrário, os separadores decimais podem causar erro.
