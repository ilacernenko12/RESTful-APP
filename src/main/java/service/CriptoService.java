package service;

import model.Cripto;

import java.util.List;

public interface CriptoService {

    void create(Cripto cripto);

    void read(long id);

    void delete (Long id);
    List<Cripto> getAll();

}
