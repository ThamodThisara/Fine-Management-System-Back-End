package edu.fine_management.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Officer {
    private Integer id;
    private String officer;
    private String name;
    private String position;
    private String nic;
    private String email;
    private String policeStation;
    private String address;
}
