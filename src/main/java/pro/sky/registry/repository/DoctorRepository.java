package pro.sky.registry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.registry.entity.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
