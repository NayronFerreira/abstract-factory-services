import factory.RestAbstractFactory;
import factory.SOAPAbstractFactory;
import factory.ServiceAbstractFactory;
import model.entities.CarService;
import model.entities.UserService;

public class Client {

    public static void main(String[] args) {

        UserService userService = null;
        ServiceAbstractFactory factory = new SOAPAbstractFactory();
        userService = factory.getUserService();
        userService.save("Nayron");
        userService.delete(1);
        System.out.println(userService);

        CarService carService = null;
        ServiceAbstractFactory factory1 = new RestAbstractFactory();
        carService = factory1.getCarService();
        carService.save("BMW");
        carService.atualizar("Porshe");
    }
}
