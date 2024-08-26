package com.perscholas.ExerciseOneRest.TestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MyController {
    @RequestMapping({"/login"})
    public String showlogin()
    {
        return "inboxpage";
    }
    @RequestMapping("/")
    public String simplemethod(){
        return "inboxpage";
    }
    @RequestMapping("/index")
    public String showindex(){
        return "inboxpage";
    }
}
