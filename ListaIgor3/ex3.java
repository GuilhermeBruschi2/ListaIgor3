package com.mycompany.lista3;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ec, sexo;
        String nome;
        int idade;
        float sal;

        do {

            System.out.println("Nome: ");
            nome = sc.nextLine();

            if (nome.length() < 3) {

                System.out.println("Informe o nome maior que 3 caracteres: ");
                nome = sc.nextLine();

            }

        } while (nome.length() < 3);

        do {

            System.out.println("Idade: ");
            idade = sc.nextInt();

            if (idade > 150) {

                System.out.println("Informe uma idade entre 0 e 150: ");
                idade = sc.nextInt();

            }
        } while (idade > 150);

        do {

            System.out.println("Salário: ");
            sal = sc.nextFloat();

            if (sal <= 1) {

                System.out.println("Informe um salário maior que 0: ");
                sal = sc.nextFloat();

            }
        } while (sal <= 1);

        while (true) {

            System.out.println("Informe seu sexo[M/F]: ");

            sexo = sc.next().charAt(0);

            sexo = (Character.toString(sexo).toUpperCase()).charAt(0);

            if (sexo == 'M' || sexo == 'F') {

                break;

            } else {

                System.out.println("O sexo precisa ser 'M' ou 'F'!");

            }

        }

        while (true) {

            System.out.println("Informe seu estado civil[c/s/v/d]: ");

            ec = sc.next().charAt(0);

            ec = (Character.toString(ec).toLowerCase()).charAt(0);

            if ((ec == 'c') || (ec == 's') || (ec == 'v') || (ec == 'd')) {

                break;

            } else {

                System.out.println("O estado civil inválido!");

            }

        }

    }
}
