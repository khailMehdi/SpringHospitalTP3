package com.example.TP3.Web;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;

import com.example.TP3.Repository.PatientRepository;
import com.example.TP3.entity.Patient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller

public class PatientController {
@Autowired
    private PatientRepository patientRepository;
@GetMapping("/index")
    public String index(Model model){
               List<Patient> patientList =patientRepository.findAll();
               model.addAttribute("listPatient",patientList);
        return "patient";
    }
}
