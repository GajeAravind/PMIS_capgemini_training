package com.example.springSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class printTest {

    @GetMapping("/hii")
    public String hi(){
        return "rabin is good ";
    }


    @GetMapping("/rabin")
    public String rabin(){
        return "Artificial Intelligence (AI) helps machines learn, solve problems, and perform tasks that usually require human intelligence. It is widely used in healthcare, education, transportation, and software development to improve efficiency and accuracy. ";
    }
}
