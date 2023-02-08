package com.project.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.project.entities.Apprenant;

@RepositoryRestResource(path = "rest")
public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {

}
