import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Exercicio de saída

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:\n%s, which price is $ %.2f\n%s, which price is $ %.2f\n\nRecord: %d years old, code %d and gender %c\n\nMeasure with eight decimal places: %.8f\nRouded (three decimal places): %.3f\n", product1, price1, product2,price2, age, code, gender, measure, measure);
        System.out.printf(Locale.ENGLISH,"US Decimal point: %.3f", measure);
         **/

        /* Casting
         * Casting .0 para double ou f para float
        int a = 5;
        int b = 2;
        double result = (double) a / b;
        System.out.println(result);

        double a = 2;
        double b = 2;
        double c = a + b / 3;
        System.out.println(c);
        */

        // Entrada de dados
        /*
        Uso do scanner
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        System.out.println(nome);
        int idade = sc.nextInt();
        System.out.println(idade);
        double peso = sc.nextDouble();
        System.out.println(peso);

        Boa pratica é utilizar o sc.close() após o uso para liberar recursos do sistema

        Utilizando next/nextline

        String s1, s2, s3;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.next();
        s3 = sc.next().ChatAt(0);
        System.out.println(s1 + s2 + s3);

        É necessário utilizar um nextLine solto para limpar o buffer de leitura quando um next de outro tipo é utilizado
        antes isso porque os outros next deixam uma quebra de linha "pendente" no inputstream quando o enter é dado

        java.lang.Math
        Funções matemáticas:
        Raiz quadrada = Math.sqrt(x);
        Potenciação = Math.pow(x, y);
        Absoluto = Math.abs(x);

*/

    }
}
