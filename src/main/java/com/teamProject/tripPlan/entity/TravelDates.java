package com.teamProject.tripPlan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class TravelDates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int travelId;
    private Date departure_date;
    private Date arrival_date;
}
