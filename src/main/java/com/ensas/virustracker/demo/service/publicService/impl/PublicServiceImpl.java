package com.ensas.virustracker.demo.service.publicService.impl;

import com.ensas.virustracker.demo.entity.VirusSpreading;
import com.ensas.virustracker.demo.repository.spreadingRepository.SpreadingRepository;
import com.ensas.virustracker.demo.service.publicService.PublicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicServiceImpl implements PublicService {

    @Autowired
    SpreadingRepository spreadingRepository;

    @Override
    public List<VirusSpreading> getSpreading() {
        List<VirusSpreading> virusSpreadings = spreadingRepository.findAll();
        System.out.println("WE ARE HERE " + virusSpreadings.size());
        return virusSpreadings ;
    }

    @Override
    public void addTraces(List<VirusSpreading> traces) {

        for (VirusSpreading trace: traces
        ) {
            spreadingRepository.save(trace);
        }

    }
}
