programa
{ //tabuada para estudar laços de repetição requisitado pelo professor, como já havia feito na aula 6, apenas copiei
	
	funcao inicio()
	{//declarar variaveis, um contador, um numero, um resultado e uma variavel para continuar o codigo
		inteiro i, numero, resultado
		cadeia continuar=""
		//laço de repetição "do while" para fazer um loop do código caso o usuário desejar testar outros numeros da tabuada

		faca{
			escreva("\nDigite o numero no qual você deseja saber a tabuada: ")
			leia (numero)
			//laço para calcular os numeros da tabuada de acordo com o numero que o usuario digitou
			para(i=1;i<=10;i++){
				escreva ("\n"+numero*i)
		}
		//confirmação de loop
		escreva ("\nDeseja fazer outra tabuada? Digite 'sim' ou 'não' em letras minusculas. ")
		leia (continuar)
		}enquanto (continuar=="sim")
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 125; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */