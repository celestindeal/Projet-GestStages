package com.example.geststages.repositories;

import com.example.geststages.models.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

}
