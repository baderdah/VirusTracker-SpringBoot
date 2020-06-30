package com.ensas.virustracker.demo.repository.traceRepository;

import com.ensas.virustracker.demo.entity.Trace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraceRepository extends JpaRepository<Trace, Long> {
}
