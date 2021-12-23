package com.sw409.covid.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sw409.covid.model.Residents;

public interface ResidentsRepository extends CrudRepository<Residents, Integer> {

}
