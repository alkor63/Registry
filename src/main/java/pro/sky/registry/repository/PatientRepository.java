package pro.sky.registry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.registry.entity.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
