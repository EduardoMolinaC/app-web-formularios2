package pe.edu.cibertec.appwebformularios2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FormPromedioController {

    @GetMapping
    public String formpromedio(Model model){

        return "formpromedio";
    }
}