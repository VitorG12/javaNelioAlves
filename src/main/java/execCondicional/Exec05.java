package execCondicional;

import java.util.Scanner;

public class Exec05 {
    /*
    Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
    seguir, calcule e mostre o valor da conta a pagar.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short codigo, quantidade;
        String especificacao = "";
        float preco = 0, pagar;
        System.out.print("Informe código e quantidade do item: ");
        codigo = sc.nextShort();
        quantidade = sc.nextShort();
        switch (codigo){
            case 1:
                especificacao = "Cachorro Quente";
                preco = 4.00f;
                break;
            case 2:
                especificacao = "X-Salada";
                preco = 4.50f;
                break;
            case 3:
                especificacao = "X-Bacon";
                preco = 5.00f;
                break;
            case 4:
                especificacao = "Torrada simples";
                preco = 2.00f;
                break;
            case 5:
                especificacao = "Refrigerante";
                preco = 1.50f;
                break;
        }
        pagar = preco * (float)quantidade;
        System.out.printf("Total a pagar pelo(s) %s: R$ %.2f", especificacao, pagar);

    }
}
