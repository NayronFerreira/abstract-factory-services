package model.entities;

import model.entities.UserService;

public class UserRestService extends UserService {

    @Override
    public void save(String name) {
        System.out.println("Salvando o REST UserService! " + name);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("Deletando o REST UserService! " + id);
    }
}
