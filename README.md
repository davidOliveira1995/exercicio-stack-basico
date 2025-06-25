# Validador de Delimitadores

## 📄 Sobre o Projeto

Este é um mini-projeto em Java que implementa um **validador de delimitadores** — ou seja, parênteses `()`, colchetes `[]` e chaves `{}`.  
O objetivo principal é demonstrar o uso da estrutura de dados **Pilha (Stack)**, seguindo o princípio **LIFO** (*Last-In, First-Out*).

O programa verifica se uma sequência de caracteres contendo esses delimitadores está **balanceada corretamente**.  
Isso significa que para cada delimitador de abertura, deve haver um delimitador de fechamento correspondente, e na ordem correta.

---

## 🚀 Como Funciona

A lógica central do validador utiliza uma **Pilha** para rastrear os delimitadores de abertura:

1. **Iteração**: O programa percorre a string de entrada caractere por caractere.
2. **Delimitadores de Abertura**: Quando encontra `(`, `[` ou `{`, empurra (push) para a pilha.
3. **Delimitadores de Fechamento**: Quando encontra `)`, `]` ou `}`:
   - Verifica se a pilha está vazia. Se estiver, a expressão é inválida.
   - Se não estiver vazia, remove (pop) o último delimitador da pilha.
   - Compara se o delimitador de abertura removido corresponde ao atual de fechamento.
4. **Finalização**: Se a pilha estiver vazia ao final, a expressão está válida. Se sobrar algum item, é inválida.

---

## 🛠️ Tecnologias Utilizadas

- **Java 11+**
- `java.util.Stack`: Classe usada para a lógica de pilha.
> 💡 *Nota:* A lógica também pode ser implementada com `Deque` e `ArrayDeque` para melhor performance, mas aqui usamos `Stack` por fins didáticos.

---

