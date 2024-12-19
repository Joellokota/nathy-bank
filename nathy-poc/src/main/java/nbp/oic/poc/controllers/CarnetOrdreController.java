package nbp.oic.poc.controllers;

import nbp.oic.poc.entities.CarnetOrdre;
import nbp.oic.poc.models.CarnetOrdreDto;
import nbp.oic.poc.services.ICarnetOrdreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carnetOrdre/")
public class CarnetOrdreController {

    private ICarnetOrdreService carnetOrdreService;

    public CarnetOrdreController(ICarnetOrdreService carnetOrdreService) {
        this.carnetOrdreService = carnetOrdreService;
    }
    @GetMapping("/")
    public ResponseEntity<List<CarnetOrdreDto>> getAllCarnetOrdres() {

        List<CarnetOrdreDto> carnetOrdreList =  this.carnetOrdreService.getCarnetOrdreAll();
        if (carnetOrdreList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(carnetOrdreList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarnetOrdreDto> getCarnetOrdre(@PathVariable Long id) {

        CarnetOrdreDto carnetOrdreDto =  this.carnetOrdreService.getCarnetOrdre(id);
        if (carnetOrdreDto == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(carnetOrdreDto, HttpStatus.OK);
    }

    @GetMapping("/{nom}/{codeRetour}")
    public ResponseEntity<List<CarnetOrdreDto>> getCarnetOrdre(
            @PathVariable String nom,
            @PathVariable String codeRetour) {

        List<CarnetOrdreDto> carnetOrdreDtos =  this.carnetOrdreService.getCarnetOrdre(nom, codeRetour);
        if (carnetOrdreDtos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(carnetOrdreDtos, HttpStatus.OK);
    }
}
