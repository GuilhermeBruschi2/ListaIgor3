package com.mycompany.lista3;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char usu, sen;
        System.out.println("Informe o  seu usuário: ");
        usu = sc.next().charAt(0);
        System.out.println("Informe sua senha: ");
        sen = sc.next().charAt(0);

        do {
            if (usu == sen) {
                System.out.println("O usuário e senha não podem ser iguais, tente novamente");
                System.out.println("Usuário: ");
                usu = sc.next().charAt(0);
                System.out.println("Senha: ");
                sen = sc.next().charAt(0);
            }
        } while (usu == sen);

        System.out.println("Finalizado com sucesso");
    }
}
