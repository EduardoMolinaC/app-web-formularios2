package pe.edu.cibertec.appwebformularios2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.appwebformularios2.model.PromedioModel;

@Controller
public class ForImcController {

    @GetMapping ("/promedionotas")
    public String index(Model model){
        model.addAttribute("promediomodel", new PromedioModel());
        model.addAttribute("verresultado", false);


        return "formpromedio";
    }
}
