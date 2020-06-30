package com.ensas.virustracker.demo.controller;


import com.ensas.virustracker.demo.entity.VirusSpreading;
import com.ensas.virustracker.demo.service.publicService.PublicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Spreading")
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = {"Authorization", "content-type"})
public class publicController {

    @Autowired
    PublicService publicService;


    @GetMapping
    public List<VirusSpreading> addModule(){
        System.out.println("WE ARE HERE");

        List<VirusSpreading> virusSpreadings = publicService.getSpreading();
        return virusSpreadings;
    }


    @PostMapping("/uploadTraces")
    public void addModule(@RequestBody List<VirusSpreading> traces){
        publicService.addTraces(traces);
    }
}
