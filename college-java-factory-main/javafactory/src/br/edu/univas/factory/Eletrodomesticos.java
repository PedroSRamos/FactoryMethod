package br.edu.univas.factory;

import br.edu.univas.vo.Eletro;
import br.edu.univas.vo.EletronicoType;
import br.edu.univas.vo.Som;
import br.edu.univas.vo.Fogao;

public class Eletrodomesticos implements AbstractFactory {

    @Override
    public Eletro getElectronic(EletronicoType electronicType) {
        if(EletronicoType.FOGAO.equals(electronicType)){
            return new Fogao();
        } else if(EletronicoType.SOM.equals(electronicType)){
            return (Eletro) new Som();
        } else {
            return null;
        }
    }
}
