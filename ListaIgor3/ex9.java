package com.mycompany.lista3;

import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valores ímpares:");
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}
