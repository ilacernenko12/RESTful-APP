package repository;

import model.Cripto;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository interface for Cripto.class
public interface CriptoRepository extends JpaRepository <Cripto,Long> {
    void delete(Long id);

    Cripto findAllById(Long id);
}
