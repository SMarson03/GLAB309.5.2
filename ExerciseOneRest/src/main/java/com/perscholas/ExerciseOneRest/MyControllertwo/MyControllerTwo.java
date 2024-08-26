package com.perscholas.ExerciseOneRest.MyControllertwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllerTwo {
    @GetMapping({"login"})
    public String showIndex()
    {
        return "index";
    }
}
