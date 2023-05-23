package in.ac.charusat.studentmgmtsystem.controller;


import org.springframework.web.bind.annotation.*;



@RestController

public class StudentController {


    @GetMapping("/intro")
    public String Hello(){
        return "Hello World!!";
    }

}
