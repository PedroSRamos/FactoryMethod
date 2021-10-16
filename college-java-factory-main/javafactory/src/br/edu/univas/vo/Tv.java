package br.edu.univas.vo;

public class Tv implements Eletro {
    @Override
    public void turnOn(){
        System.out.println("Ligando tv");
    }
}
