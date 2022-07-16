package org.jointheleague.api.derek.CrimeSearch.service;

import org.jointheleague.api.derek.CrimeSearch.repository.LocRepository;
import org.jointheleague.api.derek.CrimeSearch.repository.dto.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocService {

    private final LocRepository locRepository;

    public LocService(LocRepository locRepository) {
        this.locRepository = locRepository;
    }

    public List<Result> getResults(String query){
        return locRepository.getResults(query);
    }

}
