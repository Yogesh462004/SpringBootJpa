package com.nt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "DOCTOR")
@Data
public class Doctor {

    @Id
    @SequenceGenerator(name="gen1" ,sequenceName="DOCTOR_SEQ",initialValue=1,allocationSize=1)
    @GeneratedValue(generator="gen1",strategy = GenerationType.AUTO) 
    @Column(name = "DID")
    private Integer DID;

    @Column(name = "DNAME") 
    private String DNAME;

    @Column(name = "DSAL")
    private Integer DSAL;
}
