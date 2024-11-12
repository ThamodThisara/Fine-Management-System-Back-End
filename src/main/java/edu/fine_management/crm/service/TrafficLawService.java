package edu.fine_management.crm.service;

import edu.fine_management.crm.model.Fine;
import edu.fine_management.crm.model.TrafficLaw;

import java.util.List;

public interface TrafficLawService {
    void add(TrafficLaw trafficLaw);
    List<TrafficLaw> getAll();
    void delete(Integer id);
    TrafficLaw getById(Integer id);
}
