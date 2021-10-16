package br.edu.univas.factory;

import br.edu.univas.vo.EletronicoFactory;

public class FactoryProvider {
    public static AbstractFactory getElectronicFactory(EletronicoFactory factoryType){
        if(EletronicoFactory.ELETRODOMESTICOS.equals(factoryType)) {
            return new Eletrodomesticos();
        } else if(EletronicoFactory.ELETRONICO.equals(factoryType)){
            return new Eletronico();
        } else {
            return null;
        }
    }
}
