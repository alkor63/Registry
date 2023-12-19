package pro.sky.registry.entity;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
public class Doctor {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id",  nullable = false)
        private int id;

        private UUID uuid;

        private String firstName;

        private String lastName;

        private String speciality;

        public Doctor(String firstName, String lastName, String speciality) {
                this.uuid = UUID.randomUUID();//generate random UUIDs
                this.firstName = firstName;
                this.lastName = lastName;
                this.speciality = speciality;
        }

        public Doctor() {}

        public int getId() {
                return id;
        }

        public UUID getUuid() {
                return uuid;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getSpeciality() {
                return speciality;
        }

        public void setSpeciality(String speciality) {
                this.speciality = speciality;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Doctor doctor = (Doctor) o;
                return id == doctor.id && uuid.equals(doctor.uuid) && firstName.equals(doctor.firstName) && lastName.equals(doctor.lastName) && speciality.equals(doctor.speciality);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, uuid, firstName, lastName, speciality);
        }

        @Override
        public String toString() {
                return "Doctor{" +
                        "id=" + id +
                        ", uuid=" + uuid +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", speciality='" + speciality + '\'' +
                        '}';
        }
}
