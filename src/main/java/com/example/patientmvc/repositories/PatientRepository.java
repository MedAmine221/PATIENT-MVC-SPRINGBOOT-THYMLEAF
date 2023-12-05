package com.example.patientmvc.repositories;

import com.example.patientmvc.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    //les 2 premiers methods sont egaux
    Page<Patient> findByNomContains (String keyword, Pageable pageable);


    @Query("select p from Patient p where p.nom like :x")
    Page<Patient> chercher (@Param("x") String keyword, Pageable pageable);

}
