package edu.fine_management.crm.service.impl;

import edu.fine_management.crm.entity.OfficerEntity;
import edu.fine_management.crm.model.Officer;
import edu.fine_management.crm.repository.OfficerRepository;
import edu.fine_management.crm.service.OfficerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OfficerServiceImpl implements OfficerService {
    final OfficerRepository repository;
    final ModelMapper mapper;

    @Override
    public void add(Officer officer) {
        repository.save(mapper.map(officer, OfficerEntity.class));
    }

    @Override
    public List<Officer> getAll() {
        List<Officer> officerList = new ArrayList<>();
        repository.findAll().forEach(entity ->{
            officerList.add(mapper.map(entity,Officer.class));
        });
        return officerList;
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Officer getById(Integer id) {
        return mapper.map(repository.findById(id),Officer.class);
    }

    @Override
    public Officer getByOfficerId(String id) {
        return mapper.map(repository.findByOfficer(id),Officer.class);
    }

    @Override
    public Officer getByNic(String nic) {
        return mapper.map(repository.findByNic(nic),Officer.class);
    }

    @Override
    public List<Officer> getByName(String name) {
        List<Officer> officerList = new ArrayList<>();
        repository.findByName(name).forEach(entity ->{
            officerList.add(mapper.map(entity,Officer.class));
        });
        return officerList;
    }

    @Override
    public List<Officer> getByPosition(String position) {
        List<Officer> officerList = new ArrayList<>();
        repository.findByPosition(position).forEach(entity ->{
            officerList.add(mapper.map(entity,Officer.class));
        });
        return officerList;
    }
}
