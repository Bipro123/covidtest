package com.covidtest.portal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SelfAssesment {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long selfAssesmentId;
    private Long userId;
    private ArrayList<String> symptoms;
    private Boolean travelHistory;
    private Boolean contactWithCovidPatient;
    private Long riskPercentage;


}
