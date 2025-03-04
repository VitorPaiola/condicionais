package verificarDiaSemana;

import java.text.Normalizer;
import java.util.Scanner;

/*
 * Faça um programa que solicite o nome de um dia da
 * semana e exiba se é um dia útil (segunda a sexta-feira)
 * ou um dia de fim de semana (sábado e domingo).
*/

public class VerificarDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String diaSemana = solicitarValor("Digite o nome de um dia da semana: ", entrada);

        verificarDia(diaSemana);

        entrada.close();
    }

    public static String solicitarValor(String mensagem, Scanner entrada) {
        String dia;
        while (true) {
            System.out.print(mensagem);
            dia = entrada.nextLine().trim().toLowerCase();
            dia = removerAcentos(dia);

            if (dia.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um dia da semana.");
                continue;
            }

            if (validarDia(dia)) {
                return dia;
            } else {
                System.out.println("Dia invalido. Digite um nome valido, como 'segunda' ou 'sabado'.");
            }
        }
    }

    public static boolean validarDia(String dia) {
        String[] diasValidos = { "segunda", "terca", "quarta", "quinta", "sexta", "sabado", "domingo" };

        for (String dias : diasValidos) {
            if (dias.equals(dia)) {
                return true;
            }
        }
        return false;
    }

    public static void verificarDia(String dia) {
        switch (dia) {
            case "segunda", "terca", "quarta", "quinta", "sexta" ->
                System.out.println("E um dia util.");
            case "sabado", "domingo" ->
                System.out.println("E um dia de fim de semana.");
        }
    }

    public static String removerAcentos(String texto) {
        // Remove acentos da string
        return Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}

/*
 * Entrada
 * Digite o nome de um dia da semana: terca
 * 
 * Saída
 * É um dia útil.
 * 
 * Entrada
 * Digite o nome de um dia da semana: sabado
 * 
 * Saída
 * É um dia de fim de semana.
*/
