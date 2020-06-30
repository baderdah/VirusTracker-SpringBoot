package com.ensas.virustracker.demo.service.traceService.impl;

import com.ensas.virustracker.demo.entity.Trace;
import com.ensas.virustracker.demo.entity.VirusSpreading;
import com.ensas.virustracker.demo.repository.spreadingRepository.SpreadingRepository;
import com.ensas.virustracker.demo.repository.traceRepository.TraceRepository;
import com.ensas.virustracker.demo.service.traceService.TraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraceServiceImpl implements TraceService {

    @Autowired
    TraceRepository traceRepository;

    @Autowired
    SpreadingRepository spreadingRepository;

    @Override
    public void addTraces(List<Trace> traces) {
        VirusSpreading virusSpreading;
        for (Trace trace: traces
             ) {
            /*
            this is just for testing we gonna programme a batch for data analyzing and seeding the spreading
            table from data in the trace table
            */
            // start of the temporary section
            virusSpreading = new VirusSpreading();
            virusSpreading.setTraceLatitude(trace.getTraceLatitude());
            virusSpreading.setTraceLongitude(trace.getTraceLongitude());
            virusSpreading.setTraceTime(trace.getTraceTime());
            spreadingRepository.save(virusSpreading);
            //end of temporary section


            traceRepository.save(trace);
        }

    }
}
