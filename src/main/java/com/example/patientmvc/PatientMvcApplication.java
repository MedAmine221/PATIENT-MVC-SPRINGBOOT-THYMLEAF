package com.example.patientmvc;

import com.example.patientmvc.entities.Patient;
import com.example.patientmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository)
    {
        return args ->
        {
            /*
            patientRepository.save(new Patient(null,"Hassan", new Date(),false,200));
            patientRepository.save(new Patient(null,"Mohamed", new Date(),true,321));
            patientRepository.save(new Patient(null,"Yasmine", new Date(),true,350));
            patientRepository.save(new Patient(null,"Nourr", new Date(),false,120));


            patientRepository.findAll().forEach(p ->{


                            System.out.println(p.getNom());
            });
            */
        };
    }
}
