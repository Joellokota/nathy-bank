package nbp.oic.poc.services.impl;

import nbp.oic.poc.entities.CarnetOrdre;
import nbp.oic.poc.models.CarnetOrdreDto;
import nbp.oic.poc.repositories.ICarnetOrdreRepository;
import nbp.oic.poc.services.ICarnetOrdreService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarnetOrdreService implements ICarnetOrdreService {

    private ModelMapper modelMapper;
    private ICarnetOrdreRepository icarnetOrdreRepository;

    public CarnetOrdreService(ModelMapper modelMapper, ICarnetOrdreRepository icarnetOrdreRepository) {
        this.modelMapper = modelMapper;
        this.icarnetOrdreRepository = icarnetOrdreRepository;
    }

    @Override
    public CarnetOrdreDto getCarnetOrdre(Long id) {
        CarnetOrdre db_carnet = this.icarnetOrdreRepository.findById(id).orElseThrow();
        return convertDTO(db_carnet);
    }

    @Override
    public List<CarnetOrdreDto> getCarnetOrdre(String nom, String codeRetour) {

        List<CarnetOrdre> db_carnet_list = this.icarnetOrdreRepository.findByNomAndCodeRetour(nom, codeRetour);
        return db_carnet_list.stream().map(this::convertDTO).toList();
    }

    @Override
    public void saveAll(List<CarnetOrdreDto> carnetOrdres) {

       this.icarnetOrdreRepository.saveAll(carnetOrdres
               .stream()
               .map(this::convertToEntity)
               .toList());
    }

    @Override
    public List<CarnetOrdreDto> getCarnetOrdreAll() {
        List<CarnetOrdre> listCarnets = (List<CarnetOrdre>) this.icarnetOrdreRepository.findAll();
        return listCarnets.stream().map(this::convertDTO).toList();
    }

    private CarnetOrdreDto convertDTO(CarnetOrdre carnetOrdre) {
        return this.modelMapper.map(carnetOrdre, CarnetOrdreDto.class);
    }

    private CarnetOrdre convertToEntity(CarnetOrdreDto carnetOrdreDto) {
        return this.modelMapper.map(carnetOrdreDto, CarnetOrdre.class);
    }
}
