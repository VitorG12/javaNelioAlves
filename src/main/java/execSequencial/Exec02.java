package execSequencial;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Exec02 {
    /*
    Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com
    quatro casas decimais conforme exemplos.
    Fórmula da área: area = π . raio2
    Considere o valor de π = 3.14159
    */
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double area, raio;
        System.out.println("Informe o valor do Raio do círculo: ");
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);
        System.out.printf("A=%.4f", area);
    }
}
