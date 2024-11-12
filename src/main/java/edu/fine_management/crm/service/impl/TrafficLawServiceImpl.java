package edu.fine_management.crm.service.impl;

import edu.fine_management.crm.entity.TrafficLawEntity;
import edu.fine_management.crm.model.TrafficLaw;
import edu.fine_management.crm.repository.TrafficLawRepository;
import edu.fine_management.crm.service.TrafficLawService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TrafficLawServiceImpl implements TrafficLawService {
    final TrafficLawRepository trafficLawRepository;
    final ModelMapper mapper;

    @Override
    public void add(TrafficLaw trafficLaw) {
        trafficLawRepository.save(mapper.map(trafficLaw, TrafficLawEntity.class));
    }

    @Override
    public List<TrafficLaw> getAll() {
        List<TrafficLaw> trafficLawList = new ArrayList<>();
        trafficLawRepository.findAll().forEach(entity->{
            trafficLawList.add(mapper.map(entity, TrafficLaw.class));
        });
        return trafficLawList;
    }

    @Override
    public void delete(Integer id) {
        trafficLawRepository.deleteById(id);
    }

    @Override
    public TrafficLaw getById(Integer id) {
        return mapper.map(trafficLawRepository.findById(id), TrafficLaw.class);
    }
}
