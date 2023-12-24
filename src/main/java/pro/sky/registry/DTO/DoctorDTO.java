package pro.sky.registry.DTO;

import lombok.Data;
import pro.sky.registry.entity.Speciality;

@Data
public class DoctorDTO {
    private String firstName;
    private String secondName;
    private String lastName;
    private Speciality speciality;
    private int cabinet;

    @Override
    public String toString() {
        return  speciality + firstName + secondName + lastName +
                " принимает в кабинете " + cabinet;
    }
}
