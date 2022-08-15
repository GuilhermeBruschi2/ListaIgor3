package com.mycompany.lista3;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite dois numeros inteiros: ");

        int primeiroNumero = scan.nextInt();

        int segundoNumero = scan.nextInt();

        int menorNumero = 0;

        if (primeiroNumero < segundoNumero) {
            menorNumero = primeiroNumero;
        } else {
            menorNumero = segundoNumero;
        }

        int diferenca = Math.abs(primeiroNumero - segundoNumero);

        for (int i = 1; i < diferenca; i++) {
            System.out.print(menorNumero + i + " ");
        }

        int soma = 0;

        for (int i = primeiroNumero; i <= segundoNumero; i++) {
            soma += i;
        }

        System.out.println("Soma: " + soma);
    }
}
