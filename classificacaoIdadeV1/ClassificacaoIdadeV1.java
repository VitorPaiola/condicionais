package classificacaoIdadeV1;

import java.util.Map;
import java.util.Scanner;

/*
 * Crie um progreama que solicite a idade de uma pessoa
 * e exiba se ela é criança (0-12 anos), adolescente (13-17
 * anos), adulto (18-59 anos) ou idoso (60 anos ou mais).
*/

public class ClassificacaoIdadeV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade = solicitarValor("Digite a idade: ", entrada);

        classificarIdade(idade);

        entrada.close();
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int idade;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um valor valido.");
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
                System.out.println("Classificacao: " + entry.getKey());
                return;
            }
        }
    }
}

/*
 * Exemplo de Execução:
 * Entrada:
 * Digite a idade: 25
 * 
 * Saída:
 * Classificacao: Adulto
 * 
 * Entrada:
 * Digite a idade: 10
 * 
 * Saída:
 * Classificacao: Crianca
 * 
 * Entrada:
 * Digite a idade: 16
 * 
 * Saída:
 * Classificacao: Adolescente
 * 
 * Entrada:
 * Digite a idade: 65
 * 
 * Saída:
 * Classificacao: Idoso
 * 
 * Entrada:
 * Digite a idade: 150
 * 
 * Saída:
 * Idade invalida. Digite um valor entre 0 e 120.
*/