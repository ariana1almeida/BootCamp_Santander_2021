programa
{ //exercício de matriz para exibir informações dadas na nela para o usuario
	
	funcao inicio()
	{ //declarar matriz de 3 linhas e 3 colunas
		cadeia matriz [][]={{"João", "São Paulo","(11)99995241"},{"Maria", "Ribeirão Preto", "(16)99998596"},{"Ana", "Manaus", "(92)99998574"}}
		//laço de repetição para acessar os dados de dentro da matriz
		para(inteiro i=0;i<3;i++){
			escreva ("\nO cliente "+matriz[i][0]+" de "+matriz[i][1]+" ligou e deixou seu número: "+matriz[i][2])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 9, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */