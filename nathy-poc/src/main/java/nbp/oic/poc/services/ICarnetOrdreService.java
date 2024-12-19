package nbp.oic.poc.services;
import nbp.oic.poc.models.CarnetOrdreDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICarnetOrdreService {

    CarnetOrdreDto getCarnetOrdre(Long id);
    public List<CarnetOrdreDto> getCarnetOrdre(String nom, String codeRetour);
    void saveAll(List<CarnetOrdreDto> carnetOrdres);
    List<CarnetOrdreDto> getCarnetOrdreAll();
}
