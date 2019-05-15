package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/Carform")
    public String loadCarForm (Model model){
        model.addAttribute("carform", new Carform());
        return "Carform";
    }

    @PostMapping("/Car")
    public String processCarForm(@Valid Carform Carform,
                                BindingResult result){
        if (result.hasErrors()){
            return "Carform";
        }
        return "Carformconfirm";}





