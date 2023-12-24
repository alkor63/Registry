package pro.sky.registry.service;

import pro.sky.registry.entity.Doctor;
import pro.sky.registry.exception.RecordNotFoundException;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();

    Doctor getDoctorById(int doctorId);

    //+++++++++++++++++++++++++++++++++++++++++
    boolean deleteDoctorById(int doctorId);

    Doctor createDoctor(Doctor doctor);

    Doctor editDoctorsCabinetById(int id, int cabinet)
            throws RecordNotFoundException;
}
