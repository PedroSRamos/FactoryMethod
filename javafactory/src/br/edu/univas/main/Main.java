package br.edu.univas.main;

import br.edu.univas.factory.AbstractFactory;
import br.edu.univas.factory.FactoryProvider;
import br.edu.univas.vo.*;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        AbstractFactory Eletrodomesticos = FactoryProvider.getElectronicFactory(EletronicoFactory.ELETRODOMESTICOS);
        AbstractFactory Eletronico = FactoryProvider.getElectronicFactory(EletronicoFactory.ELETRONICO);

        System.out.println("Qual dispositivo você deseja ligar?\n 1 para TV;\n 2 para celular;\n 3 para som;\n 4 fogao");

        int option = sc.nextInt();

        Eletro tv = Eletronico.getElectronic(EletronicoType.TV);
        Eletro celular = Eletronico.getElectronic(EletronicoType.CELULAR);
        Eletro som = Eletrodomesticos.getElectronic(EletronicoType.SOM);
        Eletro fogao = Eletrodomesticos.getElectronic(EletronicoType.FOGAO);;

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
            case 4:
                fogao.turnOn();
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }
    }
}
