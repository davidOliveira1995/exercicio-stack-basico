public class Main {

    public static void main(String[] args) {
        ValidadorDelimitadores validador = new ValidadorDelimitadores();

        // Casos de teste
        String expressao1 = "{[()]}"; // Válido
        String expressao2 = "([)]";   // Inválido
        String expressao3 = "{[]}";    // Válido
        String expressao4 = "(((";     // Inválido
        String expressao5 = ")))";     // Inválido
        String expressao6 = "";        // Válido (string vazia)
        String expressao7 = "a(b[c]d)"; // Válido (ignora outros caracteres)

        System.out.println("Validando expressões:");
        System.out.println("'" + expressao1 + "' é válido? " + validador.validar(expressao1));
        System.out.println("'" + expressao2 + "' é válido? " + validador.validar(expressao2));
        System.out.println("'" + expressao3 + "' é válido? " + validador.validar(expressao3));
        System.out.println("'" + expressao4 + "' é válido? " + validador.validar(expressao4));
        System.out.println("'" + expressao5 + "' é válido? " + validador.validar(expressao5));
        System.out.println("'" + expressao6 + "' é válido? " + validador.validar(expressao6));
        System.out.println("'" + expressao7 + "' é válido? " + validador.validar(expressao7));
    }
}