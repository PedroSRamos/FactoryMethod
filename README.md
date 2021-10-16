# Trabalho de Enganharia de Software 

Trabalho usando o Factory Method ->  método de fábrica

## O que é um Factory Method?

É um padrão de projeto criacional, que resolve o problema de criar objetos de produtos sem especificar suas classes concretas.

## Qual a função?

Define uma interface (uma interface java ou uma classe abstrata) e permite que as subclasses decidam qual objeto instanciar. O método de fábrica na interface permite que uma classe adie a instanciação para uma ou mais subclasses concretas. Uma vez que esses padrões de projeto falam sobre a instanciação de um objeto e, portanto, se enquadra na categoria de padrão de projeto criativo.

## Pontos Positivos :

Por ser um padrão de software, a implementação do factory Method implica na também implementação, mesmo que de forma implícita, de uma linguagem universal no código, ou seja, outros developers que conhecem o padrão já entenderão o código e sem precisar ir aos detalhes;
Remove o acoplamento forte que existia nas classes que tinham, além da lógica de negócio própria delas, os códigos de criação de instâncias;
Encapsula o código que varia, código de instanciação de classe. Cada código de criação fica em um único local, em sua própria classe, criando assim um ponto único de atualização. 
