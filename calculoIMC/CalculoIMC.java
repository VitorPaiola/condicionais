package calculoIMC;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/*
 * Escreva um programa que solicite a altura e o peso de
 * uma pessoa e calcule o seu índice de massa corporal (IMC),
 * exibindo a categoria correspondente (abaixo do peso,
 * peso normal, sobrepeso, obesidade, obesidade grave).
*/

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double peso = solicitarValor("Digite o peso (em kg): ", entrada);
        double altura = solicitarValor("Digite a altura (em metros): ", entrada);

        calcularIMC(peso, altura);

        entrada.close();
    }

    public static double solicitarValor(String mensagem, Scanner entrada) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um valor valido.");
                continue;
            }

            try {
                valor = Double.parseDouble(input);
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

    public static void calcularIMC(double peso, double altura) {
        double imc = peso / Math.pow(altura, 2);

        String categoria = classificarIMC(imc);

        System.out.println("Seu IMC e: " + String.format(Locale.US, "%.2f", imc));
        System.out.println("Categoria: " + categoria);
    }

    public static String classificarIMC(double imc) {
        Map<String, Double[]> categorias = Map.of(
                "Abaixo do peso", new Double[] { Double.NEGATIVE_INFINITY, 18.5 },
                "Peso normal", new Double[] { 18.5, 24.9 },
                "Sobrepeso", new Double[] { 25.0, 29.9 },
                "Obesidade", new Double[] { 30.0, 39.9 },
                "Obesidade grave", new Double[] { 40.0, Double.POSITIVE_INFINITY });

        for (Map.Entry<String, Double[]> entry : categorias.entrySet()) {
            if (imc >= entry.getValue()[0] && imc < entry.getValue()[1]) {
                return entry.getKey();
            }
        }

        return "Categoria desconhecida"; // Se por algum motivo não entrar nas faixas
    }
}

/*
 * Exemplo de Execução:
 * Entrada:
 * Digite o peso (em kg): 100
 * Digite a altura (em metros): 1.72
 * 
 * Saída:
 * Seu IMC e: 33.80
 * Categoria: Obesidade
 * 
 * Entrada:
 * Digite o peso (em kg): 60.0
 * Digite a altura (em metros): 1.57
 * 
 * Saída:
 * Seu IMC e: 24.34
 * Categoria: Peso normal
 */