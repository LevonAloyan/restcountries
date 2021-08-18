package eu.restcountries.teams.controller;

import eu.restcountries.teams.entity.Country;
import eu.restcountries.teams.service.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/rest/v2/name/{countryName}")
    public ResponseEntity<Country> getCountry (@PathVariable() String countryName){
       return ResponseEntity.ok(countryService.getCountry(countryName));
    }
}