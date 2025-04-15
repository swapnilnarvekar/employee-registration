package home.practice.employee.registration.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmployeeRegistrationController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String testRequestMapping() {
        System.out.println("Checking Test RequestMapping - " + "Successful");
        return "Checking Test RequestMapping - " + "Successful ";
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    String register(@RequestParam("message") String message) {
        System.out.println("message is received as : " + message);
        return "Registration is done successfully !"+message;
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeRegistrationController.class, args);
    }
}
