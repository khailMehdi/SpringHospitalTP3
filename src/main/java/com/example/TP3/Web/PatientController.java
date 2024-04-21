package com.example.TP3.Web;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
public String index(Model model,
                    @RequestParam(name = "page",defaultValue = "0") int p,
                    @RequestParam(name = "size",defaultValue = "4")int s,
                    @RequestParam(name = "keyword",defaultValue = "")String kw
){
    Page<Patient> pagePatients=patientRepository.findAll(PageRequest.of(p,s));
    model.addAttribute("listPatient",pagePatients.getContent());
    model.addAttribute("pages",new int[pagePatients.getTotalPages()]);
    model.addAttribute("currentPage",p);
        return "patient";
    }
}
