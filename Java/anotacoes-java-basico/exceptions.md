# Exceção

Exceções são todos os erros que ocorrem durante o processamento de um método que podem ser esperados ou não esperados. Como o termo já diz, "Exceptions" são exceções. Falhas que não devem ocorrer rotineiramente no fluxo de um sistema.



Exemplo de tratamento de exceção:

`public static void metodo() {`

​	`	try {`	

​		`	new java.io.FileInputStream("arquivo.txt");`	

​		`} catch (java.io.FileNotFoundException e) {`

​			`	System.out.println("Não foi possível abrir o arquivo para leitura");`	

​	`	}`

`}`



![image-20210719145501564](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210719145501564.png)





Exceções esperadas e não esperadas:

Checked exceptions são exceções esperadas, cujo fluxo ou método de um sistema foi preparado para receber. Um bom exemplo é uma exceção de negócio, onde se deseja informar um erro caso a exceção esperada ocorra.

exemplo de checked exception:

`try {`

`PreparedStatement stmt = con.prepareStatement (query);`

`//...`

`} catch (SQLException e) {`

`throw new AcessoADadosException("Problema na criação do Statement", e);`

`}`



Unchecked exceptions:

São exceções não esperadas para o fluxo ou método de um sistema, um bom exemplo é a famosa NullPointException que ocorre quando se tenta acessar uma referência de memória vazia, ou recuperar uma instância que não existe, dentre outros motivos.

Exemplo de unchecked exception:

`try {`

`CarroVo carro = new CarroVo();`

`carro.getPlaca();`

`} catch (IntegrationException e) {`

`throw new BusinessException("Erro na criação do objeto", e);`

`}`



Bloco try catch

O bloco try catch sempre é utilizado quando no processo que será executado dentro de um método é esperado um erro, então cria-se um bloco "protegido" onde qualquer erro que ocorra dentro do trecho "try" é direcionado para o trecho "catch" e sofrerá o devido tratamento de erro.

Exemplo de um bloco try/catch

`try {`

`PreparedStatement stmt = con.prepareStatement(query);`

`//...`

`} catch (SQLException e) {`

`throuw new AcessoADadosException("Problema na criação do Statement", e);`

`}`



Finally e throw:

Finally:

O finally é um bloco de código que pode ou não ser utilizado junto ao try catch, este trecho de código sempre será executado independente se ocorrer erro ou não dentro do fluxo onde existe o try catch. Normalmente o finally é usado para liberar recursos ou para dar continuidade em um fluxo que deve ocorrer independente de erro.

Exemplo de bloco finally:

`try {`

`PreparedStatement stmt = con.prepareStatement(query);`

`//...`

`} catch (SQLException e) {`

`throw new AcessoADadosException("Problema na criação do Statement", e);`

`} finally {`

`stmt.close();`

`}`



Throw e throws:

Throws: é a assinatura do método que será retornado caso ocorra erro para o método que fez a chamada, dentro de um fluxo encadeado.

Throw: é usando para lançar a exceção desejada, juntamente com a mensagem de erro, para o método que fez a chamada.

Exemplo de throw e throws:

`public String recuperarIdUsuario(String query) throws AcessoADadosException{`

`try{`

`PreparedStatement stmt = con.prepareStatement(query);`

`//...`

`} catch (SQLExeption e) {`

`throw new AcessoADadosException("Problema na criação do Statement", e);`

`} funally {`

`stmt.close();`

`}`

`}`

