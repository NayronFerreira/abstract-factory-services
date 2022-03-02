package model.entities;

import model.entities.CarService;

public class CarSOAPService extends CarService {

    @Override
    public void save() {
        System.out.println("Salvando o SOAP CarService!");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando o SOAP CarService!");
    }
}
