package edu.fine_management.crm.service;

import edu.fine_management.crm.model.Fine;

import java.time.LocalDate;
import java.util.List;

public interface FineService {
    void add(Fine fine);

    List<Fine> getAll();

    void delete(Integer id);

    Fine getById(Integer id);

    List<Fine> getByDate(LocalDate date);

    Integer getFineCount();
}
