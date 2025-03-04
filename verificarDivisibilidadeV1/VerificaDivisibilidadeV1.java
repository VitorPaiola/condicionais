package verificarDivisibilidadeV1;

import java.util.Map;
import java.util.Scanner;

/*
 * Escreva um programa que solicite um número inteiro e
 * verifique se é divisível por 3 e por 5 ao mesmo tempo.
*/

public class VerificaDivisibilidadeV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = solicitarValor("Digite um numero inteiro: ", entrada);

        verificaDivisibilidade(numero);

        entrada.close();
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um valor valido.");
                continue;
            }

            try {
                valor = Integer.parseInt(input);
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Entrada invalida. Digite um valor valido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void verificaDivisibilidade(int numero) {
        Map<String, Boolean> condicoes = Map.of(
                "Divisivel por 3 e por 5", numero % 3 == 0 && numero % 5 == 0,
                "Divisivel apenas por 3", numero % 3 == 0 && numero % 5 != 0,
                "Divisivel apenas por 5", numero % 3 != 0 && numero % 5 == 0);

        for (Map.Entry<String, Boolean> entry : condicoes.entrySet()) {
            if (entry.getValue()) {
                System.out.println(entry.getKey());
                return;
            }
        }

        System.out.println("Nao e divisivel por 3 nem por 5.");
    }
}

/*
 * Exemplos de Execução:
 * Entrada: 15
 * Digite um numero inteiro: 15
 * Divisível por 3 e por 5
 * 
 * Entrada: 9
 * Digite um numero inteiro: 9
 * Divisível apenas por 3
 * 
 * Entrada: 10
 * Digite um numero inteiro: 10
 * Divisível apenas por 5
 * 
 * Entrada: 7
 * Digite um numero inteiro: 7
 * Nao e divisível por 3 nem por 5.
*/