package com.ensas.virustracker.demo.service.publicService;

import com.ensas.virustracker.demo.entity.VirusSpreading;

import java.util.List;

public interface PublicService {

    List<VirusSpreading> getSpreading();


    void addTraces(List<VirusSpreading> spreading);
}
