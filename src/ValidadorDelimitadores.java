import java.util.Stack;

public class ValidadorDelimitadores {

    public boolean validar(String expressao) {

        Stack<Character> pilha = new Stack<>();


        for (char caractere : expressao.toCharArray()) {

            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            }

            else if (caractere == ')' || caractere == ']' || caractere == '}') {

                if (pilha.empty()) {
                    return false;
                }

                char ultimoAberto = pilha.pop();

                if (caractere == ')' && ultimoAberto != '(') {
                    return false;
                } else if (caractere == ']' && ultimoAberto != '[') {
                    return false;
                } else if (caractere == '}' && ultimoAberto != '{') {
                    return false;
                }
            }
        }

        return pilha.empty();
    }
}