package pro.sky.registry.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class InfoController {

    @Tag(name = "Информация о приложении", description = "здесь только информация")
        @GetMapping
        @Operation(summary = "Приветствие", description = "для проверки запуска программы")
        public String hello() {
            return "Приложение стартовало!";
        }
        @GetMapping("/info")
        @Operation(summary = "Информация о приложении", description = "указаны автор, название и назначение приложения")
        public String info() {
            return "Web-приложение Регистратура (бронируем талон к врачу), Алексей Корниенко, 11.12.2023г.";
        }
    }
