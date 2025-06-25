import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack <T> {

    private ArrayList<T> elementos;

    public Stack() {
        this.elementos = new ArrayList<>();
    }

    public void push(T item) {
        elementos.add(item); // Adiciona o item no final do ArrayList
        System.out.println("Push: " + item + " | Pilha: " + elementos);
    }

    public T pop() {
        if (empty()) { // Verifica se a pilha está vazia antes de tentar remover
            throw new EmptyStackException();
        }
        // Remove o último elemento do ArrayList, que é o topo da nossa pilha
        T itemRemovido = elementos.remove(elementos.size() - 1);
        System.out.println("Pop: " + itemRemovido + " | Pilha: " + elementos);
        return itemRemovido;
    }

    public T peek() {
        if (empty()) { // Verifica se a pilha está vazia antes de tentar espiar
            throw new EmptyStackException();
        }
        // Retorna o último elemento do ArrayList sem removê-lo
        T itemTopo = elementos.get(elementos.size() - 1);
        System.out.println("Peek: " + itemTopo + " | Pilha: " + elementos);
        return itemTopo;
    }

    public boolean empty() {
        return elementos.isEmpty();
    }

    // --- Exemplo de uso (apenas para demonstração da MinhaPropriaStack) ---
    public static void main(String[] args) {
        Stack<String> minhaPilha = new Stack<>();

        System.out.println("Pilha vazia? " + minhaPilha.empty()); // true

        minhaPilha.push("Primeiro Elemento");
        minhaPilha.push("Segundo Elemento");
        minhaPilha.push("Terceiro Elemento");

        System.out.println("\nElemento no topo: " + minhaPilha.peek());

        System.out.println("\nRemovendo elementos:");
        minhaPilha.pop();
        minhaPilha.pop();

        System.out.println("\nPilha vazia? " + minhaPilha.empty()); // false

        minhaPilha.push("Novo Elemento");

        System.out.println("\nRemovendo o último elemento: " + minhaPilha.pop());
        System.out.println("Removendo o elemento restante: " + minhaPilha.pop());

        System.out.println("\nPilha vazia? " + minhaPilha.empty()); // true

        try {
            minhaPilha.pop(); // Isso vai lançar EmptyStackException
        } catch (EmptyStackException e) {
            System.out.println("\nErro: " + e.getMessage() + " - Pilha está vazia!");
        }
    }
}