package pro.sky.registry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.registry.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
