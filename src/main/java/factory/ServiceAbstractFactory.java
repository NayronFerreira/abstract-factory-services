package factory;

import model.entities.CarService;
import model.entities.UserService;

public abstract class ServiceAbstractFactory {

    public abstract UserService getUserService();

    public abstract CarService getCarService();

}
