package verificarDivisibilidadeV2;

import java.util.Map;
import java.util.Scanner;

/*
 * Escreva um programa que solicite ao usuário a quantidade de números
 * que deseja verificar e então verifique se cada um deles é divisível
 * por 3 e por 5 ao mesmo tempo.
 */

public class VerificarDivisibilidadeV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidade = solicitarValor("Quantos numeros deseja verificar? ", entrada);

        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            numeros[i] = solicitarValor("Digite o numero " + (i + 1) + ": ", entrada);
        }

        for (int numero : numeros) {
            verificaDivisibilidade(numero);
        }

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
                    System.out.println("Entrada invalida. Digite um numero valido.");
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
                System.out.println("Numero " + numero + ": " + entry.getKey());
                return;
            }
        }

        System.out.println("Numero " + numero + ": Nao e divisivel por 3 nem por 5.");
    }
}

/*
 * Exemplo de Execução:
 * Quantos números deseja verificar? 4
 * Digite o número 1: 15
 * Digite o número 2: 9
 * Digite o número 3: 10
 * Digite o número 4: 7
 * 
 * Número 15: Divisível por 3 e por 5
 * Número 9: Divisível apenas por 3
 * Número 10: Divisível apenas por 5
 * Número 7: Não é divisível por 3 nem por 5.
 */