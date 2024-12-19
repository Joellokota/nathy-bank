package nbp.oic.poc.repositories;

import nbp.oic.poc.entities.CompteClient;
import org.springframework.data.repository.CrudRepository;

public interface ICompteClientRepository extends CrudRepository<CompteClient, Long> {
}
