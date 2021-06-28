programa
{ /*Criar quatro variaveis: janeiro, fevereiro, março e abril, solicitar o valor das vendas do mês citado,
se o a media for maior ou igual a 5 mil, ceder abono de 10%, se for menor que 5 mil, ceder abono de 3%*/
	
	funcao inicio()
	{ //determinar variaveis utilizadas, meses serao numeros inteiros
		real vendas, media, soma=0, salario
		inteiro meses
		
		//laço de repetição para reutilizar as variaveis meses e somar o total
		para (meses=0;meses<4;meses++){ 
			escreva ("Digite o valor das suas vendas de janeiro, fevereiro, março e abril, respectivamente, um de cada vez: ")
			leia(vendas)
			soma+=vendas
		}
		//declarar como sera o calculo da média e do salário (nesse caso, os vendedores recebem 5% do total das vendas, mais o abono que será somado abaixo
		media=soma/meses
		salario=soma*0.05

		//estrutura condicional para mostrar a media do total das vendas e o salário dos vendedores
		se(media>=5000){
			escreva("\nA média das vendas dos 4 meses foi:"+media)
			escreva("\nO valor total de vendas ultrapassou a meta, os vendedores receberão um abono de 10%!")
			escreva ("\nO salário dos vendedores será de:"+salario*1.1)
		}
		//caso o numero da media nao sera maior ou igual a 5000, o senao faz uma alternativa, ou seja, muda o valor do abono
		senao{
			escreva("\nA média das vendas dos 4 meses foi:"+media)
			escreva ("\nO valor total de vendas não bateu a meta, os vendedores receberão um abono de 3%")
			escreva ("\nO salário dos vendedores será de:"+salario*1.03)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */