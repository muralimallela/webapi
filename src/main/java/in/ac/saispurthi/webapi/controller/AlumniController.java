package in.ac.saispurthi.webapi.controller;

import in.ac.saispurthi.webapi.model.AlumniModel;
import in.ac.saispurthi.webapi.service.AlumniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alumni")
public class AlumniController {
    @Autowired
    private AlumniService alumniService;
    @PostMapping("/add")
    public String addAlumni(@RequestBody AlumniModel alumniModel){
        alumniService.addAlumni(alumniModel);
        return "Alumni added";
    }
    @GetMapping("/allAlumni")
    public List<AlumniModel> allAlumni(){
        return alumniService.alumniList();
    }
    @GetMapping("/getById/{id}")
    public Optional<AlumniModel> getAlumniById(@PathVariable String id){
        return alumniService.getAlumniById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteAlumni(@PathVariable String id){
        alumniService.deleteAlumni(id);
        return "Alumni deleted";
    }

}
