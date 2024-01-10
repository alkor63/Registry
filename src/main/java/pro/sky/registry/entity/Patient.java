package pro.sky.registry.entity;

import javax.persistence.*;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
@Data
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",  nullable = false)
    private int id;

    private UUID uuid;

    private String firstName;

    private String lastName;

    private Date birthday;

    public Patient(String firstName, String lastName, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.uuid = UUID.randomUUID();//generate random UUIDs
    }
    public Patient() {  }

    @Override
    public int hashCode() {
        return Objects.hash(id, uuid, firstName, lastName, birthday);
    }

    @Override
    public String toString() {
        return "patient{" +
                "id=" + id +
                ", uuid=" + uuid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
