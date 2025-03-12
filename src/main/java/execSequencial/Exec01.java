package execSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exec01 {
    /*
    Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    mensagem explicativa, conforme exemplos
    */
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        double num1, num2, soma;
        System.out.println("Digite os números que deseja somar separados por espaço: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        sc.close();
        soma = (int) num1 + num2;
        System.out.printf("SOMA = %.0f", soma);
    }
}
