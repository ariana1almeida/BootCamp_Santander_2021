programa
{ /*exibir nome, sobrenome e idade do leitor para exercício de concatenação*/
	
	funcao inicio()
	{
		inteiro idade
		cadeia nome, sobrenome, confirmacao="" //cadeia pega não só a letra, e sim a frase toda que é escrito

		faca{
			escreva ("Digite seu primeiro nome: ")
			leia (nome)
			escreva ("Digite seu sobrenome de preferência: ")
			leia (sobrenome)
			escreva ("Digite sua idade: ")
			leia (idade)
			escreva ("Seu nome completo é: "+nome +" "+sobrenome +" e sua idade é: " +idade)
			escreva ("\nEssas informações estão corretas?(sim ou não)")
			leia (confirmacao)
		}enquanto((confirmacao!="sim"))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 564; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */