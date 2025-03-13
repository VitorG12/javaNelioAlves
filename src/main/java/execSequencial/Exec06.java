package execSequencial;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

public class Exec06 {
    /*
    Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
    Em seguida, calcule e mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B
    */
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        float a,b,c, triangulo, retangulo, trapezio, quadrado, circulo, pi;
        pi = 3.14159f;
        System.out.println("Informe os valores de A, B e C separados por espaço: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        triangulo = (a * c) / 2;
        circulo = pi * (float) pow(c, 2);
        trapezio = ((a + b) * c) / 2;
        quadrado = (float) pow(b, 2);
        retangulo = a * b;
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);

    }
}
