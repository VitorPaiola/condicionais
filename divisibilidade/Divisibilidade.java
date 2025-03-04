package divisibilidade;

import java.util.Map;
import java.util.Scanner;

/*
 * Faça um programma que solicite dois números e
 * exiba se o primeiro é divisível pelo segundo.
*/

public class Divisibilidade {
    private static final int TAM_LISTA = 2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[TAM_LISTA];

        String[] variaveis = { "primeiro", "segundo" };

        for (int i = 0; i < TAM_LISTA; i++) {
            numeros[i] = solicitarValor("Digite o " + variaveis[i] + " valor: ", entrada);
        }

        System.out.println("\nResultado:");
        verificarDivisibilidade(numeros);

        entrada.close();
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int numero;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero valido.");
                continue;
            }

            try {
                numero = Integer.parseInt(input);
                if (numero >= 0) {
                    return numero;
                } else {
                    System.out.println("Entrada invalida. Digite um numero valido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void verificarDivisibilidade(int[] numeros) {
        if (numeros[1] == 0) {
            System.out.println("Erro: Nao e possivel dividir por zero.");
            return;
        }

        Map<String, Boolean> condicoes = Map.of(
                numeros[0] + " e divisivel por " + numeros[1], numeros[0] % numeros[1] == 0,
                numeros[0] + " nao e divisivel por " + numeros[1], numeros[0] % numeros[1] != 0);

        for (Map.Entry<String, Boolean> entry : condicoes.entrySet()) {
            if (entry.getValue()) { // Se a condição for verdadeira
                System.out.println(entry.getKey());
                break; // Encerra o loop após encontrar a mensagem correta
            }
        }
    }
}

/*
 * Exemplo de execução:
 * Entrada:
 * Digite o primeiro valor: 10
 * Digite o segundo valor: 5
 * 
 * Saída:
 * Resultado:
 * 10 é divisível por 5
 * 
 * Entrada:
 * Digite o primeiro valor: 7
 * Digite o segundo valor: 3
 * 
 * Saída:
 * Resultado:
 * 7 não é divisível por 3
 * 
 * Entrada:
 * Digite o primeiro valor: 10
 * Digite o segundo valor: 0
 * 
 * Saída:
 * Resultado:
 * Erro: Não é possível dividir por zero.
 */