package com.project.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Apprenant {

	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	private long idApprenant;
	private int codeApprenant;
	private String nomApprenant;
	private String prenomApprenant;
	private String sexeApprenant;
	private Date dateNaissanceApprenant;
	private String emailApprenant;
	private long telApprenant;
	private String adresseApprenant;
	private boolean archiveApprenant;
	
}
