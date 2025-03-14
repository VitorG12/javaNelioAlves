package execCondicional;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

public class Exec02 {
//    Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        short num = sc.nextShort();
        if (abs(num) % 2 == 1){
            System.out.println("IMPAR");
        } else{
            System.out.println("PAR");
        }
        System.out.println();

    }
}
