package model.entities;

import model.entities.CarService;

public class CarRestService extends CarService {

    @Override
    public void save(String model) {
        System.out.println("Salvando o REST CarService!" + " " + model);
    }

    @Override
    public void atualizar(String newModel) {
        System.out.println("Atualizando o REST CarService!" + " " + newModel);
    }
}
