package com.sw409.covid.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.covid.model.Residents;
import com.sw409.covid.repositories.ResidentsRepository;
@Service
public class ResidentServices {
	@Autowired
	ResidentsRepository resRepo;

	public Residents createResident(Residents res) {
		return resRepo.save(res);
	}
	public ArrayList<Residents> getAllResident(){
		return (ArrayList<Residents>) resRepo.findAll();
				
	}
}
