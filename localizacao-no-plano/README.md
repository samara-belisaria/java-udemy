### 📌 Projeto: Localização no Plano

Este projeto foi desenvolvido durante o curso de **Java na Udemy**.  
O programa recebe dois valores que representam coordenadas (X e Y) e determina a localização correspondente no plano cartesiano: em um dos quatro quadrantes, na origem ou sobre os eixos X ou Y.

---

### 🎯 Objetivo

Praticar o uso de **condicionais encadeadas (if, else-if, else)** para tratar múltiplos cenários, além da entrada de dados via `Scanner` e manipulação de valores `double`.

---

### 📘 Conceitos Praticados

- Leitura de valores com `Scanner`
- Uso de `Locale.US` para separador decimal
- Declaração de variáveis `double`
- Estrutura condicional encadeada `if-else`
- Lógica de verificação de localização no plano cartesiano

---

### ✏️ Exemplo de Entrada e Saída

✅ **Entrada:**
4.5
-2.2

✅ **Saída:**
Q4

---

### 💻 Código Principal

```java
import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } 
        else if (x == 0) {
            System.out.println("Eixo Y");
        } 
        else if (y == 0) {
            System.out.println("Eixo X");
        } 
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } 
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } 
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } 
        else {
            System.out.println("Q4");
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
- Java • Locale • Scanner • System.out.println • Estruturas condicionais

---

## ⚙️ Como Executar

```bash
1. Copie o código abaixo para um arquivo chamado Coordenadas.java
2. Compile com: javac Coordenadas.java
3. Execute com: java Coordenadas
