package model.entities;

import model.entities.UserService;

public class UserSOAPService extends UserService {

    @Override
    public void save(String name) {
        System.out.println("Salvando o SOAP UserService! " + name);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("Deletando o SOAP UserService! " + id);
    }
}
