package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Celular;
import br.edu.univas.vo.Som;
import br.edu.univas.vo.Tv;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("trabalho");
        System.out.println("Qual dispositivo você deseja ligar?\n 1 para TV;\n 2 para celular;\n 3 para som.");

        int option = sc.nextInt();

        Tv tv = new Tv();
        Celular celular = new Celular();
        Som som = new Som();

        switch (option) {
            case 1:
                tv.turnOn();
                break;
            case 2:
                celular.turnOn();
                break;
            case 3:
                som.turnOn();
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }
    }
}
