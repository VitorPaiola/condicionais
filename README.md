# 📌 Estruturas Condicionais e Manipulação de Dados em Java

Este repositório contém diversos programas em Java que exploram o uso de estruturas condicionais
e manipulação de dados, realizando operações como iteração sobre objetos, verificação de condições 
com `if-else`, uso de arrays, e captura de exceções com `try-catch`. Além disso, os programas utilizam
o `Scanner` para entrada de dados do usuário e implementam a modularização do código por meio de métodos.

Um dos principais recursos explorados foi o uso do `Map`, que oferece uma alternativa mais eficiente para
substituir loops e a estrutura `switch-case`, tornando o código mais limpo e de fácil manutenção.

## 🚀 Tecnologias Utilizadas

- **Java (JDK 8+)**
- **Scanner** para entrada de dados do usuário
- **Estruturas de controle** (condicionais: `if`, `else if`, `else`; loops: `for`)
- **Estruturas de dados** (arrays, `Map` e `entrySet`)
- **Captura de exceções** com `try-catch`
- **Métodos** para modularização do código

## 📌 Confira meu artigo no DEV.to

Para aprender mais sobre Java e ver exemplos de exercícios práticos, confira meu artigo no 
[DEV.to](https://dev.to/vitorpaiola/lista-de-exercicios-basicos-em-java-part-4-5fl0)! 🚀 No artigo, 
compartilho soluções de problemas comuns e discuto técnicas para melhorar o código Java, 
além de apresentar exemplos de uso de estruturas condicionais, loops e manipulação de dados.

## 📂 Estrutura do Projeto

```estrutura
📦 condicionais
├── 📁 calculoIMC
│   └── CalculoIMC.java
├── 📁 classificacaoIdadeV1
│   └── ClassificacaoIdadeV1.java
├── 📁 classificacaoIdadeV2
│   └── ClassificacaoIdadeV2.java
├── 📁 divisibilidade
│   └── Divisibilidade.java
├── 📁 verificarAprovacao
│   └── VerificarAprovacao.java
├── 📁 verificarDiaSemana
│   └── VerificarDiaSemana.java
├── 📁 verificarDivisibilidadeV1
│   └── VerificarDivisibilidadeV1.java
└── 📁 verificarDivisibilidadeV2
    └── VerificarDivisibilidadeV2.java
```

## 🛠️ Como Compilar e Executar

Para compilar e executar qualquer um dos programas, siga os passos abaixo:

### 1️⃣ **Compilar**

Abra o terminal e navegue até a pasta `src` do projeto. Em seguida, 
execute o seguinte comando para compilar o código:

```sh
javac -d . condicionais/NomeDaPasta/NomeDoArquivo.java
```

### 2️⃣ **Executar**

Após a compilação, você pode executar o programa com o comando abaixo:

```sh
java condicionais.NomeDaPasta.NomeDoArquivo
```

Exemplo:

```sh
java condicionais.verificarAprovacao.VerificarAprovacao
```

## 📌 Descrição dos Programas

### ⚖️ **Cálculo IMC**
Calcula o Índice de Massa Corporal (IMC) com base no peso e altura fornecidos pelo usuário.

#### Exemplo de Execução:

**Entrada:**
```java
Digite o peso (em kg): 100
Digite a altura (em metros): 1.72
```
**Saída:**
```java
Seu IMC é: 33.80
Categoria: Obesidade
```

**Entrada:**
```java
Digite o peso (em kg): 60.0
Digite a altura (em metros): 1.57
```
**Saída:**
```java
Seu IMC é: 24.34
Categoria: Peso normal
```

### 🔢 **Classificação de Idade versão-1**
Classifica a idade do usuário em diferentes faixas etárias (crianca, adolescente, adulto, idoso).

#### Exemplo de Execução:

**Entrada:**
```java
Digite a idade: 25
```

**Saída:**
```java
Classificacao: Adulto
```

**Entrada:**
```java
Digite a idade: 10
```

**Saída:**
```java
Classificacao: Crianca
```

**Entrada:**
```java
Digite a idade: 16
```

**Saída:**
```java
Classificacao: Adolescente
```

**Entrada:**
```java
Digite a idade: 65
```

**Saída:**
```java
Classificacao: Idoso
```

**Entrada:**
```java
Digite a idade: 150
```

**Saída:**
```java
Idade invalida. Digite um valor entre 0 e 120.
```

### 🔢 **Classificação de Idade versão-2**
Classifica a idade do usuário em diferentes faixas etárias (crianca, adolescente, adulto, idoso) 
com uma lógica diferente.

#### Exemplo de Execução:

**Entrada:**
```java
Quantas idades deseja verificar? 3
Digite a idade 1: 25
Digite a idade 2: 10
Digite a idade 3: 65
```

**Saída:**
```java
Classificacoes:
Idade 25: Adulto
Idade 10: Crianca
Idade 65: Idoso
```

### 🔍 **Divisibilidade**
Verifica se dois número fornecidos pelo usuário são divisíveis entre si.

#### Exemplo de Execução:

**Entrada:**
```java
Digite o primeiro valor: 10
Digite o segundo valor: 5
```

**Saída:**
```java
Resultado:
10 e divisivel por 5
```

**Entrada:**
```java
Digite o primeiro valor: 7
Digite o segundo valor: 3
```

**Saída:**
```java
Resultado:
7 nao e divisivel por 3
```

**Entrada:**
```java
Digite o primeiro valor: 10
Digite o segundo valor: 0
```

**Saída:**
```java
Resultado:
Erro: Nao e possivel dividir por zero.
```

### 📚 **Verificar Aprovação**
Verifica se o aluno foi aprovado com base na média calculada.

#### Exemplo de Execução:

**Entrada:**
```java
Digite a primeira nota: 8.5
Digite a segunda nota: 7.0
Digite a terceira nota: 6.5
```

**Saída:**
```java
Nota (7.33): Aluno aprovado
```

**Entrada:**
```java
Digite a primeira nota: 3.0
Digite a segunda nota: 4.0
Digite a terceira nota: 2.5
```

**Saída:**
```java
Nota (3.17): Aluno reprovado
```

**Entrada:**
```java
Digite a primeira nota: 5.0
Digite a segunda nota: 6.0
Digite a terceira nota: 4.5
```

**Saída:**
```java
Nota (5.17): Aluno em recuperacao
```

**Entrada:**
```java
Digite a primeira nota: -2
Entrada invalida. A nota deve estar entre 0 e 10.
Digite a primeira nota: abc
Entrada invalida. Digite apenas numeros inteiros ou decimais.
Digite a primeira nota: 7.5
Digite a segunda nota: 8.0
Digite a terceira nota: 9.0
```

**Saída:**
```java
Nota (8.17): Aluno aprovado
```

### 📆 **Verificar Dia da Semana**
Determina se o dia da semana é dia útil (segunda a sexta-feira) ou um dia de fim de semana(sábado e domingo).

#### Exemplo de Execução:

**Entrada:**
```java
Digite o nome de um dia da semana: terca
```

**Saída:**
```java
E um dia util.
```

**Entrada:**
```java
Digite o nome de um dia da semana: sabado
```

**Saída:**
```java
E um dia de fim de semana.
```

### 🔍 **Verificar Divisibilidade versão-1**
Verifica se um número inteiro é divisível por 3 e por 5 ao mesmo tempo.

#### Exemplo de Execução:

**Entrada:**
```java
Digite um numero inteiro: 15
```

**Saída:**
```java
Divisivel por 3 e por 5
```

**Entrada:**
```java
Digite um numero inteiro: 9
```

**Saída:**
```java
Divisivel apenas por 3
```

**Entrada:**
```java
Digite um numero inteiro: 10
```

**Saída:**
```java
Divisivel apenas por 5
```

**Entrada:**
```java
Digite um numero inteiro: 7
```

**Saída:**
```java
Nao e divisivel por 3 nem por 5.
```

### 🔍 **Verificar Divisibilidade versão-2**
Verifica se uma quantidade de números desejados é divisível por 3 e por 5 ao mesmo tempo.

#### Exemplo de Execução:

**Entrada:**
```java
Quantos números deseja verificar? 4
Digite o numero 1: 15
Digite o numero 2: 9
Digite o numero 3: 10
Digite o numero 4: 7
```

**Saída:**
```java
Numero 15: Divisivel por 3 e por 5
Numero 9: Divisivel apenas por 3
Numero 10: Divisivel apenas por 5
Numero 7: Nao e divisivel por 3 nem por 5.
```

## 📌 Quer acompanhar mais dicas e novidades sobre Java?

🔔 Fique por dentro de tudo sobre Java! Me siga no [Twitter](https://x.com/v__souz) para receber dicas, 
novidades e atualizações! 🚀✨

---

### 📜 **Licença**
Este projeto foi desenvolvido por mim e está livre para uso e modificação sem restrições formais.
Fique à vontade para usar e adaptar o código conforme necessário.

### 🤝 **Contribuições**
Contribuições são sempre bem-vindas! Se você tem sugestões ou gostaria de adicionar novos 
programas ou funcionalidades, sinta-se à vontade para abrir um Pull Request. 
Estou ansioso para ver suas melhorias! 😃
