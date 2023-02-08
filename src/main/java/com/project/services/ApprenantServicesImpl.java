package com.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.entities.Apprenant;
import com.project.repos.ApprenantRepository;

public class ApprenantServicesImpl implements ApprenantServices{

	@Autowired
	ApprenantRepository apprenantRepository ;

	@Override
	public Apprenant saveApprenant(Apprenant A) {
		// TODO Auto-generated method stub
		return apprenantRepository.save(A);
	}

	@Override
	public Apprenant updateApprenant(Apprenant A) {
		
		return apprenantRepository.save(A);
	}

	@Override
	public void deletApprenant(Apprenant A) {
		// TODO Auto-generated method stub
		apprenantRepository.delete( A);
	}

	@Override
	public void deletApprenantById(long id) {
		// TODO Auto-generated method stub
		apprenantRepository.deleteById( id);
	}

	@Override
	public Apprenant getApprenant(long id) {
		// TODO Auto-generated method stub
		return apprenantRepository.findById(id).get();
	}

	@Override
	public List<Apprenant> getAllApprenant() {
		// TODO Auto-generated method stub
		return apprenantRepository.findAll();
	}

}
