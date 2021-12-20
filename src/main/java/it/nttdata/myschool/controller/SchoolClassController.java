package it.nttdata.myschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.nttdata.myschool.repository.SchoolClassRepository;

@Controller
public class SchoolClassController {
    
    private SchoolClassRepository schoolClassRepository;
 
    public SchoolClassController(SchoolClassRepository schoolClassRepository) {
        this.schoolClassRepository = schoolClassRepository;
    }

    @GetMapping("/classes")
    public String getClasses(Model model){
        model.addAttribute("schoolClasses", schoolClassRepository.findAll());
        return "classes";
    }
}
