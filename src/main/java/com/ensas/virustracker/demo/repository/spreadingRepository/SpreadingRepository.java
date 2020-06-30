package com.ensas.virustracker.demo.repository.spreadingRepository;

import com.ensas.virustracker.demo.entity.VirusSpreading;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpreadingRepository extends JpaRepository<VirusSpreading, Long>{
}
