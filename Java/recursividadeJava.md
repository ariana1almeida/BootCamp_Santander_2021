# Recursividade

Na recursividade, uma função chama a si mesma repetidamente, até atingir uma condição de parada.

No caso de Java, um método chama a si mesmo, passando para si objetos primitivos. Cada chamada gera uma nova entrada na pilha de execução, e alguns dados podem ser disponibilizados em um escopo global ou local, através de parâmetros em um escopo global ou local.

![image-20210726153309604](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210726153309604.png)

Recursividade tem um papel importante em programação funcional, facilitando que evitemos estados mutáveis e mantenhamos nosso programa mais declarativo, e menos imperativo.

![image-20210726153329656](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210726153329656.png)

![image-20210726153357335](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210726153357335.png)

Tail Call (Recursividade em cauda): Recursão em cauda é uma recursão onde não há nenhuma linha de código após a chamada do próprio método e, sendo assim, não há nenhum tipo de processamento a ser feito após a chamada recursiva.

Obs.: a JVM não suporta a recursão em cauda, ele lança um estouro de pilha (StackOverFlow)

![image-20210726153837959](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210726153837959.png)

![image-20210726153900032](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210726153900032.png)

Se precisar passar números muito grandes no Java, ele vai crashar, pois não tem suporte.



Memoization: é uma técnica de otimização que consiste no cache do resultado de uma função, baseado nos parâmetros de entrada. Com isso, nas seguintes execuções conseguimos ter uma resposta mais rápida.

![image-20210726154424380](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210726154424380.png)

![image-20210726154603751](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210726154603751.png)





![image-20210726154736709](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210726154736709.png)

letra a

 ![image-20210726155030966](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210726155030966.png)

letra b

