package com.Happy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class EventsEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventId;

    private String eventName;

    private double eventAmount;

    private String eventImg1;

    private String eventImg2;

    private String eventImg3;

    private String eventDetails;

    private String eventCategory;

}
