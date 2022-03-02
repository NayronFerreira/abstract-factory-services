package model.entities;

import model.entities.UserService;

public class UserRestService extends UserService {

    @Override
    public void save() {
        System.out.println("Salvando o REST UserService!");
    }

    @Override
    public void delete() {
        System.out.println("Deletando o REST UserService!");
    }
}
