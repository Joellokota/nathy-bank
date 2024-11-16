package com.andyalex.nathyagency.services;

import com.andyalex.nathyagency.entity.Agency;
import com.andyalex.nathyagency.repository.AgencyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgencyService {

    private AgencyRepository agencyRepository;

    public AgencyService(AgencyRepository agencyRepository) {
        this.agencyRepository = agencyRepository;
    }

    public List<Agency> findAll() {
        List<Agency> agencies = (List<Agency>) this.agencyRepository.findAll();
        return agencies;
    }

    public Agency findByAgency(Long id) {
        return this.agencyRepository.findById(id).get();
    }

    public void saveAll(List<Agency> agencies) {
        this.agencyRepository.saveAll(agencies);
    }
}
