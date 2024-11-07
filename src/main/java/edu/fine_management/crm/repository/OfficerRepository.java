package edu.fine_management.crm.repository;

import edu.fine_management.crm.entity.OfficerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfficerRepository extends JpaRepository<OfficerEntity,Integer> {
    OfficerEntity findByOfficer(String id);
    OfficerEntity findByNic(String nic);
    List<OfficerEntity> findByName(String name);
    List<OfficerEntity> findByPosition(String position);
}
