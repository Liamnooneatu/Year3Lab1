package ie.atu.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Week1 {
    @GetMapping("/message")
    public String message()
    {
        return "hello";
    }

    @GetMapping("/greet/{name}")
    public String name(@PathVariable String name )
    {
        return "Your name is " + name;
    }

    @GetMapping("/details")
    public String age(@RequestParam String age1)
    {
        return "Your Age: " + age1;
    }


}
