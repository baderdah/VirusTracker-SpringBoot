package com.ensas.virustracker.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;


@Entity
public class VirusSpreading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long traceId;

    private Timestamp traceTime;

    private Double traceLongitude;
    private Double traceLatitude;

    public Long getTraceId() {
        return traceId;
    }

    public void setTraceId(Long traceId) {
        this.traceId = traceId;
    }

    public Timestamp getTraceTime() {
        return traceTime;
    }

    public void setTraceTime(Timestamp traceTime) {
        this.traceTime = traceTime;
    }

    public Double getTraceLongitude() {
        return traceLongitude;
    }

    public void setTraceLongitude(Double traceLongitude) {
        this.traceLongitude = traceLongitude;
    }

    public Double getTraceLatitude() {
        return traceLatitude;
    }

    public void setTraceLatitude(Double traceLatitude) {
        this.traceLatitude = traceLatitude;
    }
}
