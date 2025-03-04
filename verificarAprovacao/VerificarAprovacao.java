/*
 * Faça um programa que leia três notas de um aluno e informe
 * se ele foi aprovado (nota final >= 7), reporvado (nota final
 *  <= 4) ou se ficou de recuperação (nota final entre 4 e 7).
*/

import java.util.Locale;
import java.util.Scanner;

public class VerificarAprovacao {
    private static final int TAM_LISTA = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[] notas = new double[TAM_LISTA];

        String[] variaveis = { "primeira", "segunda", "terceira" };

        for (int i = 0; i < TAM_LISTA; i++) {
            notas[i] = solicitarValor("Digite a " + variaveis[i] + " nota: ", entrada);
        }

        exibirResultado(notas);

        entrada.close();
    }

    public static double solicitarValor(String mensagem, Scanner entrada) {
        double nota;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite uma nota valida.");
                continue;
            }

            try {
                nota = Double.parseDouble(input);
                if (nota >= 0) {
                    return nota;
                } else {
                    System.out.println("Entrada invalida. A nota deve estar entre 0 e 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros inteiros ou decimais.");
            }
        }
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static void exibirResultado(double[] notas) {
        double media = calcularMedia(notas);
        String status = determinarStatus(media);

        System.out.printf(Locale.US, "Nota (%.2f): %s%n", media, status);
    }

    public static String determinarStatus(double media) {
        return switch ((media > 7) ? 1 : (media <= 4) ? -1 : 0) {
            case 1 -> "Aluno aprovado";
            case -1 -> "Aluno reprovado";
            default -> "Aluno em recuperacao";
        };
    }
}

/*
 * Exemplo 1 - Aluno Aprovado
 * Digite a primeira nota: 8.5
 * Digite a segunda nota: 7.0
 * Digite a terceira nota: 6.5
 * Nota (7.33): Aluno aprovado
 * 
 * Exemplo 2 - Aluno Reprovado
 * Digite a primeira nota: 3.0
 * Digite a segunda nota: 4.0
 * Digite a terceira nota: 2.5
 * Nota (3.17): Aluno reprovado
 * 
 * Exemplo 3 - Aluno em recuperação
 * Digite a primeira nota: 5.0
 * Digite a segunda nota: 6.0
 * Digite a terceira nota: 4.5
 * Nota (5.17): Aluno em recuperação
 * 
 * Exemplo 4 - Entrada Inválida e Validação
 * Digite a primeira nota: -2  
 * Entrada inválida. A nota deve estar entre 0 e 10.  
 * Digite a primeira nota: abc  
 * Entrada inválida. Digite apenas números inteiros ou decimais.  
 * 
 * Digite a primeira nota: 7.5  
 * Digite a segunda nota: 8.0  
 * Digite a terceira nota: 9.0
 * Nota (8.17): Aluno aprovado
*/