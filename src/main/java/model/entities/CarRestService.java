package model.entities;

import model.entities.CarService;

public class CarRestService extends CarService {

    @Override
    public void save() {
        System.out.println("Salvando o REST CarService!");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando o REST CarService!");
    }
}
