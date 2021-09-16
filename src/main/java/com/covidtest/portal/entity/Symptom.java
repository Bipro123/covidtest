package com.covidtest.portal.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Symptom {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long symptomId;
    private String symptomName;
}
