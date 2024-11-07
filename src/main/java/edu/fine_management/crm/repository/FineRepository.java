package edu.fine_management.crm.repository;

import edu.fine_management.crm.entity.FineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface FineRepository extends JpaRepository<FineEntity, Integer> {
    List<FineEntity> findByDate(LocalDate date);
}
