package model.entities;

import model.entities.CarService;

public class CarSOAPService extends CarService {

    @Override
    public void save(String model) {
        System.out.println("Salvando o SOAP CarService!" + " " + model);
    }

    @Override
    public void atualizar(String newModel) {
        System.out.println("Atualizando o SOAP CarService!" + " " + newModel);
    }
}
