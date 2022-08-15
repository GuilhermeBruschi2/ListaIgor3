package com.mycompany.lista3;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a ;
        int b;
        int ano;
        
        System.out.println("Informe a polulação do país A: ");
        a = sc.nextInt();
        System.out.println("Informe a população do país B: ");
        b = sc.nextInt();
        ano = 0;
        
        if (a > b) {
            System.out.println("O país A ja possui a população maior que o país B");
        }

        while (a <= b) {

            ano = ano + 1;
            a = (int) (a * 0.03);
            b = (int) (b * 0.015);
            
            System.out.println("A ultrapassa ou iguala B em " + ano + " anos");
        }

    }

}
