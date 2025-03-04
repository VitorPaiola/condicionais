package classificacaoIdadeV2;

import java.util.Map;
import java.util.Scanner;

/*
 * Escreva um programa que solicite ao usuário a quantidade de números
 * que deseja verificar e, solicite a idade de uma pessoa
 * exibindo se ela é criança (0-12 anos), adolescente (13-17
 * anos), adulto (18-59 anos) ou idoso (60 anos ou mais).
*/

public class ClassificacaoIdadeV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidade = solicitarValor("Quantas idades deseja verificar? ", entrada);

        int[] idades = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            idades[i] = solicitarValor("Digite a idade " + (i + 1) + ": ", entrada);
        }

        System.out.println("\nClassificacoes:");
        for (int idade : idades) {
            classificarIdade(idade);
        }

        entrada.close();
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int idade;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um valor valido");
                continue;
            }

            try {
                idade = Integer.parseInt(input);
                if (idade >= 0 && idade <= 120) {
                    return idade;
                } else {
                    System.out.println("Idade invalida. Digite um valor entre 0 e 120.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void classificarIdade(int idade) {
        Map<String, Boolean> condicoes = Map.of(
                "Crianca", idade >= 0 && idade <= 12,
                "Adolescente", idade >= 13 && idade <= 17,
                "Adulto", idade >= 18 && idade <= 59,
                "Idoso", idade >= 60);

        for (Map.Entry<String, Boolean> entry : condicoes.entrySet()) {
            if (entry.getValue()) {
                System.out.println("Idade " + idade + ": " + entry.getKey());
                return;
            }
        }
    }
}

/*
 * Exemplo de Execução:
 * Entrada:
 * Quantas idades deseja verificar? 3
 * Digite a idade 1: 25
 * Digite a idade 2: 10
 * Digite a idade 3: 65
 * 
 * Saída:
 * Classificacoes:
 * Idade 25: Adulto
 * Idade 10: Crianca
 * Idade 65: Idoso
 */