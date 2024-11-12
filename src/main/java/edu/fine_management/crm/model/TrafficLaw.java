package edu.fine_management.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TrafficLaw {
    private Integer id;
    private String title;
    private String description;
    private Double fineAmount;
}
