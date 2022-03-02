package model.entities;

import model.entities.UserService;

public class UserSOAPService extends UserService {

    @Override
    public void save() {
        System.out.println("Salvando o SOAP UserService!");
    }

    @Override
    public void delete() {
        System.out.println("Deletando o SOAP UserService!");
    }
}
