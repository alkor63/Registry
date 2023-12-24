package pro.sky.registry.service;

import org.springframework.stereotype.Service;
import pro.sky.registry.entity.Doctor;
import pro.sky.registry.exception.RecordNotFoundException;
import pro.sky.registry.repository.DoctorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }


    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctorById(int doctorId) {
        System.out.println("Search doctor on id = " + doctorId);
        return doctorRepository.findById(doctorId).orElseThrow();
    }

    //    Получение информации об объявлении
    Optional<Doctor> getDoctor(int id) {
        return doctorRepository.findById(id);
    }

    //+++++++++++++++++++++++++++++++++++++++++
    @Override
    public boolean deleteDoctorById(int doctorId) {

        Optional<Doctor> optionalDoctor = doctorRepository.findById(doctorId);
        if (optionalDoctor.isPresent()) {
            doctorRepository.deleteById(doctorId);
            return true;
        } else {
            new RecordNotFoundException(String.valueOf(doctorId));
            return false;
        }
    }

    @Override
    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor editDoctorsCabinetById(int id, int cabinet)
            throws RecordNotFoundException {

        Optional optionalDoctor = doctorRepository.findById(id);
        if (!optionalDoctor.isPresent()) {
            throwException(String.valueOf(id));

        }
        Doctor existingDoctor = (Doctor) optionalDoctor.get();

        existingDoctor.setCabinet(cabinet);

        return doctorRepository.save(existingDoctor);
    }

    private void throwException(String valueOf) {
    }
}

