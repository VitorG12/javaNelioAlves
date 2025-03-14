package execCondicional;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

public class Exec03 {
    /*
    Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
    Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados"
    + em ordem crescente ou decrescente
    */
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        short num1, num2, temp;
        System.out.print("Informe dois números inteiros separados por espaço: ");
        num1 = (short)abs(sc.nextShort());
        num2 = (short)abs(sc.nextShort());

        if (num2 > num1){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 % num2 == 0){
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }



/*
        Versão refatorada
        if (num1 > num2){
            if (num1 % num2 == 0){
                System.out.println("Sao Multiplos");
            }else {
                System.out.println("Nao sao Multiplos");
            }
        } else {
            if (num2 % num1 == 0){
                System.out.println("Sao Multiplos");
            }else {
                System.out.println("Nao sao Multiplos");
            }
        }
*/
    }
}
