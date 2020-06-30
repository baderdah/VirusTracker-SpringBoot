package com.ensas.virustracker.demo;

import com.ensas.virustracker.demo.entity.Identification;
import com.ensas.virustracker.demo.entity.VirusExaminator;
import com.ensas.virustracker.demo.repository.VExaminatorRepository.VirusExaminatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class MiniProjetApplication {

	@Autowired
	VirusExaminatorRepository virusExaminatorRepository;
	public void seedInitData(){

		List<VirusExaminator> VExaminator = virusExaminatorRepository.findAll();
		if( VExaminator.size() == 0){
			VirusExaminator virusExaminator = new VirusExaminator();
			Identification identification = new Identification();
			identification.setPassword("password");
			identification.setUsername("Examinator");
			virusExaminator.setEmail("Examinator");
			virusExaminator.setNom("Examinator");
			virusExaminator.setIdentification(identification);
			virusExaminator.setPrenom("Examinator");

			virusExaminatorRepository.save(virusExaminator);
			System.out.println("seeding");
		}
	}

	@EventListener
	public void seed(ContextRefreshedEvent event) {
		seedInitData();

	}

	public static void main(String[] args) {
		SpringApplication.run(MiniProjetApplication.class, args);
	}
}
