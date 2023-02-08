package com.project.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.Apprenant;
import com.project.services.ApprenantServices;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ApprenantRestController {
	@Autowired
	ApprenantServices apprenantService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Apprenant> getAllApprenant() {
	return apprenantService.getAllApprenant();
	}

	
}
