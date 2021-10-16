package br.edu.univas.vo;

public class Fogao implements Eletro {
    @Override
    public void turnOn() {
        System.out.println("Fogao ligando");
    }
}
