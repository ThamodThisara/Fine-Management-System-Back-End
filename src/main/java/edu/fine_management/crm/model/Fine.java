package edu.fine_management.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fine {
    private Integer id;
    private LocalDate date;
    private LocalTime time;
    private String driverName;
    private String driverLicenceNumber;
    private String driverNic;
    private String driverAddress;
    private String driverEmail;
    private String driverContact;
    private String fineTitle;
    private double fineTotalAmount;
    private String officerId;
}
