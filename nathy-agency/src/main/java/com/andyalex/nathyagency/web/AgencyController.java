package com.andyalex.nathyagency.web;

import com.andyalex.nathyagency.entity.Agency;
import com.andyalex.nathyagency.services.AgencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class AgencyController {

    private AgencyService agencyService;

    public AgencyController(AgencyService agencyService) {
        this.agencyService = agencyService;
    }

    @GetMapping("list-agencies")
    public List<Agency> getAgencies() {
        List<Agency> agencies = this.agencyService.findAll();
        return agencies;
    }
    @GetMapping("list-agencies/{id}")
    public Agency getAgencyById(Long id) {
        return this.agencyService.findByAgency(id);
    }
}
