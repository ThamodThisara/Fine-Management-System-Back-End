package edu.fine_management.crm.service;

import edu.fine_management.crm.model.Officer;

import java.util.List;

public interface OfficerService {
    void add(Officer officer);
    List<Officer> getAll();
    void delete(Integer id);
    Officer getById(Integer id);
    Officer getByOfficerId(String id);
    Officer getByNic(String nic);
    List<Officer> getByName(String name);
    List<Officer> getByPosition(String position);
}
