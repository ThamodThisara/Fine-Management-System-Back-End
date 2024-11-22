package edu.fine_management.crm.service.impl;

import edu.fine_management.crm.entity.FineEntity;
import edu.fine_management.crm.model.Fine;
import edu.fine_management.crm.repository.FineRepository;
import edu.fine_management.crm.service.FineService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FineServiceImpl implements FineService {
    final FineRepository fineRepository;
    final ModelMapper mapper;
    @Override
    public void add(Fine fine) {
        fineRepository.save(mapper.map(fine, FineEntity.class));
    }

    @Override
    public List<Fine> getAll() {
        List<Fine> fines = new ArrayList<>();
        fineRepository.findAll().forEach(fineEntity -> fines.add(mapper.map(fineEntity, Fine.class)));
        return fines;
    }

    @Override
    public void delete(Integer id) {
        fineRepository.deleteById(id);
    }

    @Override
    public Fine getById(Integer id) {
        return mapper.map(fineRepository.findById(id), Fine.class);
    }

    @Override
    public List<Fine> getByDate(LocalDate date) {
        List<Fine> fines = new ArrayList<>();
        fineRepository.findByDate(date).forEach(fineEntity -> fines.add(mapper.map(fineEntity, Fine.class)));
        return fines;
    }

    @Override
    public Integer getFineCount() {
        return Math.toIntExact(fineRepository.count());
    }
}
