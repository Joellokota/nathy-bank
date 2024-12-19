package nbp.oic.poc.repositories;

import nbp.oic.poc.entities.CarnetOrdre;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICarnetOrdreRepository extends CrudRepository<CarnetOrdre, Long> {
    List<CarnetOrdre> findByNomAndCodeRetour(String nom, String codeRetour);
}
