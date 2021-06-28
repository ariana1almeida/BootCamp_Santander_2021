programa
{
	
	funcao inicio()
	{
		//variavel cadeia para o nome do vendedor, 4 do tipo real para vendas, total, média e meses
		cadeia vendedor
		inteiro meses, vendas, total=0, media
		//declarar nome do vendedor
		escreva("Digite o nome do vendedor: ")
		leia(vendedor)
		//laço para encurtar o codigo, os meses irão até 4 e serão utilizados para calcular a media das vendar
		para(meses=0;meses<4;meses++){
			escreva ("Digite o valor das vendas do mês "+meses+" : ")
			leia (vendas)
			total+=vendas
		}
		//media é igual ao total dividido pelo numero de meses que o vendedor vendeu
		media=total/meses
		//resultado
		escreva ("O total das vendas do vendedor "+vendedor+" foi de : "+total+" e a média das vendas foi de: "+media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 187; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vendedor, 7, 9, 8}-{meses, 8, 10, 5}-{total, 8, 25, 5}-{media, 8, 34, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */