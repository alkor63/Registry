package pro.sky.registry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.registry.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
