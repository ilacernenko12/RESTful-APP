package service;

import lombok.extern.slf4j.Slf4j;
import model.Cripto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CriptoRepository;

import java.util.List;
@Service
@Slf4j
public class CriptoServiceImpl implements CriptoService{

    @Autowired
    CriptoRepository criptoRepository;

    @Override
    public void create (Cripto cripto) {
        criptoRepository.save(cripto);
    }

    @Override
    public void read (long id){
        criptoRepository.findById(id);
    }


    @Override
    public void delete(Long id) {
        log.info("IN CriptoServiceImpl delete {}", id);
        criptoRepository.delete(id);
    }

    @Override
    public List<Cripto> getAll() {
        log.info("IN CriptoServiceImpl getAll {}");
        return criptoRepository.findAll();
    }
}
