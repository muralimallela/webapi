package in.ac.saispurthi.webapi.controller;

import in.ac.saispurthi.webapi.model.AdmissionModel;
import in.ac.saispurthi.webapi.service.AdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/admissions")

public class AdmissionController {
    @Autowired
    private AdmissionService admissionService;
    @PostMapping("/add")
    public String addAdmission(@RequestBody AdmissionModel admissionModel){
        admissionService.addAdmission(admissionModel);
        return "admission added";
    }
    @GetMapping("/allAdmissions")
    public List<AdmissionModel> allAdmissions(){
        return admissionService.allAdmissions();
    }
    @GetMapping("/admissionById/{id}")
    public Optional<AdmissionModel> admissoinById(@PathVariable String id){
        return admissionService.admissionById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteAdmission(@PathVariable String id){
        admissionService.deleteAdmission(id);
        return "Admission deleted";
    }
}
