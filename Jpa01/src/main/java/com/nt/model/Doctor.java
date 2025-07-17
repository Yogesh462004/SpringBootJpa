package com.nt.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DOCTOR")
@Data
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    @Column(name = "DID")
    private Integer DID;

    @Column(name = "DNAME") 
    private String DNAME;

    @Column(name = "DSAL")
    private Integer DSAL;
}
