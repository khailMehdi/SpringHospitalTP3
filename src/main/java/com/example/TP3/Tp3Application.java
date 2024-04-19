package com.example.TP3;

import com.example.TP3.Repository.PatientRepository;
import com.example.TP3.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Tp3Application implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
		SpringApplication.run(Tp3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Patient p1 = new Patient(null,"Mehdi",new Date(),false,95);
		patientRepository.save(p1);
		patientRepository.save(new Patient(null,"Bouchra",new Date(),true,58));
		patientRepository.save(new Patient(null,"Ayoub",new Date(),false,100));

	}
}
