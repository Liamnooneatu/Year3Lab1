package ie.atu.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Week1 {
    @GetMapping("/message")
    public String message()
    {
        return "hello";
    }
}
