package com.covidtest.portal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Zone {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long numCases;
    private Long pinCode;
    private String zoneType;

}
