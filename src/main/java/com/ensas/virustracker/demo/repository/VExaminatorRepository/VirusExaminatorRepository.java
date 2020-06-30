package com.ensas.virustracker.demo.repository.VExaminatorRepository;

import com.ensas.virustracker.demo.entity.VirusExaminator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirusExaminatorRepository extends JpaRepository<VirusExaminator,Long> {

    VirusExaminator findByEmail(String email);


}
