package model.entities;

import factory.ServiceAbstractFactory;

public abstract class CarService {

    public abstract void save(String model);

    public abstract void atualizar(String newModel);

}
