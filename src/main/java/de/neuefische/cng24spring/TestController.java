package de.neuefische.cng24spring;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/hello")
public class TestController {

    @GetMapping

    public String hello(){
        return "Hello World!";
    }


}
