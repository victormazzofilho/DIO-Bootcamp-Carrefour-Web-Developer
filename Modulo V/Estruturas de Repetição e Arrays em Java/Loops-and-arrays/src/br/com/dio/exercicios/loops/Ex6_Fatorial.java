package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {

    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);

        int resultado = 1;

        System.out.println("Digite o número fatorial desejado (n!): ");
        int fatorial = scan.nextInt();

        for (int i = fatorial; i > 0; i--) resultado *= i;

        System.out.println(fatorial + "! = "  + resultado);
    }
}
