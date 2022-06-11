package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 *Faça um programa que peça N números inteiros,
 *calcule e mostre a quantidade de números pares
 *e a quantidade de números impares.
 */

public class Ex4_ParEImpar {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int quantidade;
        int numero;
        int par = 0;
        int impar = 0;

        System.out.println("Digite quantos valores serão digitados:");
        quantidade = scan.nextInt();

        while(quantidade !=0){
            System.out.println("Digite um numero inteiro: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) par++;
            else impar++;

            quantidade--;
        }

        System.out.println("Foram digitados " + par + " numero(s) par(es) e " + impar + " numero(s) ímpar(es)");
    }
}