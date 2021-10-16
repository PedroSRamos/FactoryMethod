package br.edu.univas.factory;
import br.edu.univas.vo.Eletro;
import br.edu.univas.vo.EletronicoType;

public interface AbstractFactory {
    Eletro getElectronic(EletronicoType electronicType);
}