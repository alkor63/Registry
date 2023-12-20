package pro.sky.registry.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
import java.util.UUID;
@Data
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
