package br.edu.univas.vo;

public class Celular implements Eletro {
    @Override
    public void turnOn(){
        System.out.println("Ligando celular");
    }
}
