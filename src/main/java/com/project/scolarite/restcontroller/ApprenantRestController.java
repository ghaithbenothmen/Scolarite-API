package com.project.scolarite.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.scolarite.entities.Apprenant;
import com.project.scolarite.services.ApprenantServices;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ApprenantRestController {
	@Autowired
	ApprenantServices apprenantService;
	
	@RequestMapping(value="/all",method = RequestMethod.GET)
	public List<Apprenant> getAllApprenant() {
		
	return apprenantService.getAllApprenant();
	}
	
	@RequestMapping(value="/{idApprenant}",method = RequestMethod.GET)
	public Apprenant getApprenantById(@PathVariable("idApprenant") Long idApprenant) {
		return apprenantService.getApprenant(idApprenant);
	}
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public Apprenant createApprenant(@RequestBody Apprenant apprenant) {
	return apprenantService.saveApprenant(apprenant);
	}

	@RequestMapping(value="/{idApprenant}/edit",method = RequestMethod.PUT)
	public Apprenant updateApprenantt(@RequestBody Apprenant apprenant) {
		
	return apprenantService.updateApprenant(apprenant);
	
	
	}
	
	@RequestMapping(value="/{idApprenant}/patch",method = RequestMethod.PUT)
	public Apprenant patchApprenantt(@RequestBody Apprenant apprenant) {
		apprenant.setArchiveApprenant(true);
	return apprenantService.updateApprenant(apprenant);
	}
	
	@RequestMapping(value="/{idApprenant}/delete",method = RequestMethod.DELETE) 
	public void deletApprenant(@PathVariable("idApprenant") Long idApprenant)
	{
		
		apprenantService.deletApprenantById(idApprenant);}
	
	}
