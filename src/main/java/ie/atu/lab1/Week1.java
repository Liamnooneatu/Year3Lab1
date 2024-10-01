package ie.atu.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Week1 {
    @GetMapping("/message")
    public String message() {
        return "hello";
    }

    @GetMapping("/greet/{name}")
    public String name(@PathVariable String name) {
        return "Your name is " + name;
    }

    @GetMapping("/details")
    public String age(@RequestParam String age1) {
        return "Your Age: " + age1;
    }

    int num3;

    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {


        switch (operation) {
            case "multiply":
                return "operation: " + operation + "Total: " + (num1 * num2);


            case "subtract":
                return "operation: " + operation + "Total: " + (num1 - num2);


            case "add":
                return "operation: " + operation + "Total: " + (num1 + num2);


            case "divide":
                if(num2 ==0)
                    return "cannot divide by 0";
                return "operation: " + operation + "Total: " + (num1 / num2);

        }
        return operation;
    }

}




