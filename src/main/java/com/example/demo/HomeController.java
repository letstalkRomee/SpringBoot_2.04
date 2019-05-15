package com.example.demo;

import com.example.demo.Carform;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/carform")
    public String loadCarForm(Model model) {
        model.addAttribute("carshow", new Carform());
        return "carform";
    }

    @PostMapping("/carform")
    public String processCarForm(@Valid Carform carshow,
                                 BindingResult result) {
        if (result.hasErrors()) {
            return "carform";
        }
        return "carshow";
    }
}




