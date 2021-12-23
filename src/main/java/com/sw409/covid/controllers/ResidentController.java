package com.sw409.covid.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.covid.model.Residents;
import com.sw409.covid.services.ResidentServices;

@RestController
@CrossOrigin("*")
public class ResidentController {
	@Autowired
	ResidentServices rsv;
	
	@PostMapping("api/residents")
	public Residents createResident(@RequestBody Residents res) {
		return rsv.createResident(res);
	}
	@GetMapping("api/residents")
	public ArrayList<Residents> getAllResident(){
		return rsv.getAllResident();
				
	}
	
}
