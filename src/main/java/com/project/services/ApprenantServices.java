package com.project.services;

import java.util.List;

import com.project.entities.Apprenant;

public interface ApprenantServices {

	Apprenant saveApprenant(Apprenant A);
	Apprenant updateApprenant(Apprenant A);
	void deletApprenant(Apprenant A);
	void deletApprenantById(long id);
	Apprenant getApprenant(long id);
	List<Apprenant> getAllApprenant();
}
