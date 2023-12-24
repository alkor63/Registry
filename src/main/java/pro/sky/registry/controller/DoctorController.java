package pro.sky.registry.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.registry.entity.Doctor;
import pro.sky.registry.exception.RecordNotFoundException;
import pro.sky.registry.service.DoctorServiceImpl;

import java.util.List;

    @Slf4j //  добавляет логгер в класс
//    @CrossOrigin(value = "http://localhost:3000") // Позволяет настроить CORS (Cross-Origin Resource Sharing)
// для данного контроллера. Указывает, что этот контроллер может обрабатывать запросы с указанного домена
// (http://localhost:3000), даже если он отличается от домена, на котором запущено приложение.
    @RequiredArgsConstructor // генерирует конструктор с аргументами для всех полей, помеченных аннотацией @NonNull
    @RestController
    @RequestMapping("/doctor")
    public class DoctorController {
        //****************************************************
        @Autowired
        private DoctorServiceImpl doctorService;
        @GetMapping
//        @Operation(summary = "Список всех докторов")
        public List<Doctor> getAllDoctors() {
            List<Doctor> doctorList = doctorService.getAllDoctors();
//            return MapperUtil.convertList(adList, this::convertToAdsDto);
            return doctorList;
        }

        // получение всех объявлений
        @GetMapping("/{id}")
//        @Operation(summary = "Получение Doctor по id")
        public Doctor getDoctorById(@PathVariable int id) {
            Doctor doc = doctorService.getDoctorById(id);
            System.out.println(doc);
            return doc;
        }

 //       private Doctor convertToAdsDto(Ad ad) {
//            return modelMapper.map(ad, AdsDTO.class);
//        }

        // добавление объявления
        @PostMapping
        public ResponseEntity<?> createAd(@RequestBody Doctor doctor) {
            if (doctor != null) {
                return new ResponseEntity<>(doctorService.createDoctor(doctor), HttpStatus.CREATED); // код 201
            } else return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        // удаление объявления по id
        @DeleteMapping("/{id}")
        public ResponseEntity<String> deleteDoctorById(@PathVariable int id) {
            boolean deleteDById = doctorService.deleteDoctorById(id);
            if (deleteDById) {
                return new ResponseEntity<>(("Doctor с id = " + id + "успешно удален из базы"), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(("Ошибка при попытке удалить Doctor с id = " + id), HttpStatus.BAD_REQUEST);
            }
        }

        // обновление объявления по id
        @PatchMapping("/{id}")
        public ResponseEntity<Doctor> updateDoctorCabinet(@PathVariable int adId, @RequestParam int cabinet) throws RecordNotFoundException {
            return ResponseEntity.ok(doctorService.editDoctorsCabinetById(adId, cabinet));
        }

}
