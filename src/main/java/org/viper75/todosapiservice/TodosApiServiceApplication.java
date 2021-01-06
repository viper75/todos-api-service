package org.viper75.todosapiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TodosApiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodosApiServiceApplication.class, args);
    }

}

@Controller
class HelloController {

    @GetMapping("/")
    String hello() {
        return "Hello From heroku";
    }
}
