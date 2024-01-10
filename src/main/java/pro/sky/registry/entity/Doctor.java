package pro.sky.registry.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Doctor {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id",  nullable = false)
        private int id;
//        ID	счетчик	Идентификатор врача
//        Фамилия	текстовый	Фамилия врача
//        Имя	текстовый	Имя врача
//        Отчество	текстовый	Отчество врача
//        Специальность	Текстовый	Специальность врача
//        Место работы	Текстовый	Отделение, в  котором работает врач
//        Кабинет	Числовой	Номер кабинета врача

        private String firstName;
        private String secondName;

        private String lastName;

        private String speciality;
        private int cabinet;

        @Override
        public String toString() {
                return "Doctor{" +
                        "id=" + id +
                        ", firstName='" + firstName + '\'' +
                        ", secondName='" + secondName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", speciality='" + speciality + '\'' +
                        ", cabinet=" + cabinet +
                        '}';
        }
}
