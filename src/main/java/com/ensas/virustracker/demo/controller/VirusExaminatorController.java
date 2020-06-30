package com.ensas.virustracker.demo.controller;

import com.ensas.virustracker.demo.entity.Trace;
import com.ensas.virustracker.demo.service.traceService.TraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/VExaminator")
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = {"Authorization", "content-type"})
public class VirusExaminatorController {

    @Autowired
    TraceService traceService;

    @PostMapping("/uploadTraces")
    public void addModule(@RequestBody List<Trace> traces){
        traceService.addTraces(traces);
    }

}
