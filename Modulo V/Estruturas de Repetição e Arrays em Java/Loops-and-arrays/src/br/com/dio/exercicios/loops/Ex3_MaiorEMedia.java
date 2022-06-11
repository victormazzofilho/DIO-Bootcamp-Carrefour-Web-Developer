package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 *Faça um programa que leia 5 números e informe o maior número
 *e a média desses números.
 */

public class Ex3_MaiorEMedia {

        public static void main(String[]args){

                Scanner scan = new Scanner(System.in);

                int maiorValor = 0;
                int soma = 0;
                double medioValor;
                int valor;

                int contador = 0;

                do {
                        System.out.println("Digite um número:");
                        valor = scan.nextInt();
                        if ( valor > maiorValor){
                                maiorValor = valor;
                        }
                        soma += valor;
                        contador++;
                } while(contador <5);

                medioValor = soma / 5;
                System.out.println("O maior valor digitado foi " + maiorValor);
                System.out.println("A média de todos os valores é " + medioValor);
        }
}
