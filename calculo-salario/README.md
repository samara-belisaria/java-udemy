## 🧮  Projeto: Cálculo de Salário

Este projeto foi desenvolvido durante o curso de Java na **Udemy**.  
O programa realiza o cálculo do salário de um funcionário com base no número de horas trabalhadas e no valor recebido por hora.

---

### 🎯 Objetivo

Praticar o uso de **tipos numéricos inteiros e decimais**, operações matemáticas básicas, entrada de dados via `Scanner` e saída formatada utilizando `System.out.printf`.  
Também foi utilizado o `Locale.US` para garantir a padronização do separador decimal (ponto ao invés de vírgula).

---

### 📘 Conceitos Praticados

- Leitura de dados com a classe `Scanner`
- Manipulação de variáveis do tipo `int` e `double`
- Operações aritméticas básicas (multiplicação)
- Formatação de saída com `System.out.printf`
- Uso do `Locale.US` para garantir a formatação numérica correta

---

## ✏️ Exemplo de Entrada e Saída
#### ✅ **Entrada:**
25

100

5.50

#### ✅ **Saída:**
NUMBER = 25

SALARY = U$ 550.00


---

### 💻 Código Principal

```java
package br.com.udemy.lesson;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int fun, num;
        double horas, resultado;

        fun = sc.nextInt();
        num = sc.nextInt();
        horas = sc.nextDouble();

        resultado = num * horas;

        System.out.println("NUMBER = " + fun);
        System.out.printf("SALARY = U$ %.2f%n", resultado);

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
- Java • Scanner • System.out.printf • Locale

---

## ⚙️ Como Executar

```bash
1. Copie o código abaixo para um arquivo chamado Salario.java
2. Compile com: javac Salario.java
3. Execute com: java Salario

✅ Certifique-se de que o locale do sistema esteja configurado para Locale.US, caso contrário, os separadores decimais podem causar erro.
