# LAMBDA

​	Os lambdas obedecem o conceito do paradigma funcional, com eles podemos facilitar legibilidade do nosso código, alem disso com a nova API Funcional do Java podemos ter uma alta produtividade para lidar com objetos. Primeiramente, devemos entender o que são interfaces funcionais.

Interfaces funcionais são interfaces que possuem apenas um método abstrato. Exemplo:

`public interface Funcao {`

​	`	String gerar(String valor);`	

`}`

Geralmente as interfaces funcionais possuem uma anotação em nivel de classe (@FunctionalInterface), para forçar o compilador a apontar um erro se a interface não estiver de acordo com as regras de uma interface funcional. Esta anotação não é obrigatória, pois o compilador consegue reconhecer uma interface em tempo de compilação.

Antes do Java 8, se quiséssemos implementar um comportamento específico para uma única classe, deveríamos utilizar uma classe anônima para implementar este comportamento.

![image-20210726141951253](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210726141951253.png)

Agora que sabemos como se define uma interface funcional, podemos aprender como se define uma lambda.

Estrutura de uma lambda:

​	InterfaceFuncional nomeVariavel = parametro -> logica

Para entender melhor, utilizaremos o exemplo da Função.

![image-20210726142122635](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210726142122635.png)

![image-20210726142331603](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210726142331603.png)

![image-20210726142418180](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210726142418180.png)

chaves na lambda precisam de ponto e virgula no final.

