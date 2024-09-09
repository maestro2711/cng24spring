package de.neuefische.cng24spring;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/hello")
public class TestController {

    @GetMapping

    public String hello(){
        return "Hello World";
    }
    @GetMapping()
    public List<Message> getallMessage(Message message){
        List<Message>messages = new ArrayList<>();
        messages.add(message);
        return messages;
    }

    @GetMapping("/{name}")
    public String hello2(@PathVariable String name){
        name = "john";
        return "Hello " +name;
    }
    @PostMapping("/api/messages")

    public Message createMessage(@RequestBody Message message){
        Message newMessage = new Message();
        return newMessage;

    }


}
