package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
public class Movie {
@Id
@GeneratedValue(generator = "gen1")
@SequenceGenerator(name="gen1" ,sequenceName="DOCTOR_SEQ",initialValue=1,allocationSize=1)
private Integer mid;
private String name;
private String year;
}
