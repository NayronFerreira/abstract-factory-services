package factory;

import model.entities.CarRestService;
import model.entities.CarService;
import model.entities.UserRestService;
import model.entities.UserService;

public class RestAbstractFactory extends ServiceAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserRestService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestService();
    }
}
