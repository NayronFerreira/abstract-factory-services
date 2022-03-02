package factory;

import model.entities.CarSOAPService;
import model.entities.CarService;
import model.entities.UserSOAPService;
import model.entities.UserService;

public class SOAPAbstractFactory extends ServiceAbstractFactory{

    @Override
    public UserService getUserService() {
        return new UserSOAPService();
    }

    @Override
    public CarService getCarService() {
        return new CarSOAPService();
    }
}
