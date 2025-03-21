package execCondicional;

import java.util.Scanner;

public class Exec04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;
        System.out.print("Informe horário inicial e final separados por espaço: ");
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        } else{
            duracao = (24 - horaInicial) + horaFinal;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
    }
}
