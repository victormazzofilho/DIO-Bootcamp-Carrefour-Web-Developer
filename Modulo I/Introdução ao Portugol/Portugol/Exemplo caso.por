//Função do Algoritmo: Menu para escolha de aplicativos
//Autor: Victor Mazzo Filho
programa
{
	
	funcao inicio()
	{
		inteiro valor = 0
		escreva("1-NETFLIX 2-AMAZON PRIME 3-HBO GO 4-SAIR ")
		escreva("\n" + "Escreva sua opção: ")
		leia(valor)
		escolha(valor)
		{
		caso 1: //Testa se o valor é igual a 1
		escreva("OK! Abrir NETFLIX!")
		pare		
		caso 2: //Testa se o valor é igual a 2
		escreva("OK! Abrir AMAZON PRIME!")		
		pare
		caso 3: //Testa se o valor é igual a 3
		escreva("OK! Abrir HBO GO!")		
		pare
		caso 4: //Testa se o valor é igual a 3
		escreva("Saindo do MENU...!")		
		pare
		caso contrario:
		escreva("Voce deve escolher a opção 1, 2 ou 3")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 591; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */