programa
{
	
	funcao inicio()
	{
		real janeiro,fevereiro,marco,abril,soma,media
		cadeia vendedor

		escreva("Digite o nome do vendedor: ")
		leia(vendedor)
		escreva("Digite o valor total das vendas de janeiro: ")
		leia(janeiro)
		escreva("Digite o valor total das vendas de fevereiro: ")
		leia(fevereiro)
		escreva("Digite o valor total das vendas de marco: ")
		leia(marco)
		escreva("Digite o valor total das vendas de abril: ")
		leia(abril)
		soma = (janeiro + fevereiro + marco + abril)
		media = soma/4
		escreva("O vendedor " + vendedor + " obteve uma somatória " + soma + " nas vendas de janeiro a abril, o que significa uma média de " + media + " por mês nesse período.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 689; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */