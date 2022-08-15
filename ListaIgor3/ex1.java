package com.mycompany.lista3;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua nota: ");
        int nota = sc.nextInt();

        do {
            if (((nota <= 0) || (nota >= 10))) {
                System.out.println("Esse valor é inválido!!! \n Informe outra nota: ");
                nota = sc.nextInt();
            }
        }  while ((nota <= 0) || (nota >= 10));
                
        System.out.println("Nota válida!");
    }
}
