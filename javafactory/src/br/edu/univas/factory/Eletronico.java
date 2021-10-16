package br.edu.univas.factory;

import br.edu.univas.vo.Celular;
import br.edu.univas.vo.Eletro;
import br.edu.univas.vo.EletronicoType;
import br.edu.univas.vo.Tv;

public class Eletronico implements AbstractFactory {

    @Override
    public Eletro getElectronic(EletronicoType electronicType) {
        if(EletronicoType.TV.equals(electronicType)){
            return (Eletro) new Tv();
        } else if(EletronicoType.CELULAR.equals(electronicType)){
            return (Eletro) new Celular();
        } else {
            return null;
        }
    }
}
