# Conteúdo Java !!!! 
## O que é java ?
O Java, como plataforma de programação, nasceu no ano de 1995 dentro dos laboratórios da empresa Sun Microsystem como resultado de uma extensa pesquisa científica e tecnológica. A plataforma Java entrega um ambiente completo para o desenvolvimento e execução de programas, sendo composta por:

Uma linguagem de programação de alto nível orientada a objetos;
Máquina Virtual (Java Virtual Machine ou <b>JVM</b>), que garante independência de plataforma, pois o código executa na máquina virtual e essa pode ser portada para outras plataformas como Windows ou Linux;
Java Runtime Environment ou <b>JRE</b>, que agrega a máquina virtual e alguns recursos para a execução de aplicações Java; e
Java Development Kit ou<b> JDK</b>, que é um conjunto de utilitários que oferece suporte ao desenvolvimento de aplicações.
No Java, os programas são escritos em um arquivo com a extensão <b>.java</b>, que em um processo posterior serão compilados para arquivos com a extensão <b>.class</b>. Esses, por sua vez, contêm os códigos a serem executados na máquina virtual, os <b>bytecodes.</b>

## Como é desenvolvido a compilação de cada processo.

O compilador é responsável por receber o código-fonte, que é escrito por uma pessoa desenvolvedora, e traduzi-lo em código binário, gerando um arquivo executável, que é a aplicação.

Neste modelo, o compilador está intimamente ligado ao sistema operacional, pois ele precisa gerar um código binário compatível com o sistema, que é o que faz a comunicação com o processador.

Para executar o mesmo programa em diferentes sistemas, devido a essa característica, era necessário passar o código-fonte por um outro compilador específico de outro sistema operacional. E ainda assim não era garantido o funcionamento da aplicação, pois muitas bibliotecas utilizadas para o desenvolvimento do programa eram específicas de um sistema operacional e não tinham funcionalidade garantida em outros.

###

### Operadores aritméticos:

Os operadores aritméticos são usados para realizar operações matemáticas básicas. São eles:

"+" (adição)
"-" (subtração)
"*" (multiplicação)
"/" (divisão)
"%" (resto da divisão)

### Operadores relacionais:

Os operadores relacionais são usados para comparar valores. Eles retornam um valor booleano (verdadeiro ou falso). Trabalharemos melhor com eles quando tivermos na aula de condicionais, onde vamos modificar o fluxo da aplicação dada alguma condição. São eles:

"==" (igual a)
"!=" (diferente de)
">" (maior que)
">=" (maior ou igual a)
"<" (menor que)
"<=" (menor ou igual a)

### Operadores lógicos:

Esses operadores são usados quando queremos verificar duas ou mais condições e/ou expressões na aplicação. Eles fazem a comparação de valores booleanos e retornam também um resultado booleano.

São três operadores: AND (&&), 
                      OR (||) 
                     NOT (!).


### Operadores de incremento:

Além dos operadores citados anteriormente, o operador de incremento é usado para aumentar o valor de uma variável em 1. Existem dois tipos de operadores de incremento: o operador de pré-incremento (++variavel) e o operador de pós-incremento (variavel++).

### Tipo Primitivos
Em Java, assim como na maioria das linguagens de programação, existem os tipos primitivos, que são os tipos de dados mais básicos e fundamentais da linguagem. Eles são utilizados para representar valores simples e são definidos pela própria linguagem.

Java possui oito tipos primitivos diferentes:<b> boolean, byte, char, short, int, long, float e double</b>. Cada um desses tipos possui suas próprias características e faixa de valores permitidos

### Text Block

Para criar um Text Block em Java, basta utilizar três aspas duplas para delimitar o texto, seguidas de uma quebra de linha. Por exemplo:
String mensagem = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;

### Formatar texto

Uma das maneiras mais comuns de se formatar textos em Java é utilizando o método format(), da classe String. Esse método permite formatar um texto utilizando diversos placeholders, que são representados pelo caractere % seguido de uma letra que indica o tipo de dado que será inserido no placeholder. Por exemplo, %s indica que uma String será inserida no placeholder, %d indica um valor inteiro e %f indica um valor decimal

### Casting explícito

O casting explícito é realizado quando o tipo de dado de origem é incompatível com o tipo de dado de destino. Nesse caso, devemos utilizar o operador de casting para realizar a conversão:
    double x = 10.5;
    int y = (int) x; // casting explícito
No exemplo anterior, o valor da variável x é convertido em um valor inteiro utilizando o casting explícito. É importante notar que, neste caso, a parte decimal será descartada e o valor atribuído à variável y será 10.


###  Switch Case

Uma alternativa ao if/else é o switch case, que é uma estrutura de controle de fluxo que permite executar diferentes ações com base no valor de uma expressão. É uma forma mais simplificada e legível de escrever vários blocos if/else encadeados.


### Estrutura de Repetição

No Java existe algumas formas de repetição para que no caso de da necessidades do programa sendo: While | Do{ }While | For.

