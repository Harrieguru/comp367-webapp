package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public ModelAndView welcome(@RequestParam(value = "name", defaultValue = "Harriet") String name) {
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("name", name);
        return modelAndView;
    }
}
