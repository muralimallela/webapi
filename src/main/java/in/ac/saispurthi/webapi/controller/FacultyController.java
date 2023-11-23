package in.ac.saispurthi.webapi.controller;

import in.ac.saispurthi.webapi.model.FacultyModel;
import in.ac.saispurthi.webapi.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    @Autowired
    private FacultyService facultyService;
    @PostMapping("/add")
    public String addStudent(@RequestBody FacultyModel facultyModel){
        facultyService.addFaculty(facultyModel);
        return "Faculty added";
    }
    @GetMapping("/getAllFaculty")
    public List<FacultyModel> getAllStudents(){
        return facultyService.facultyLIst();
    }
    @GetMapping("getByID/{id}")
    public Optional <FacultyModel> getFacultyByID(@PathVariable String id){
        return facultyService.getFacultyByID(id);
    }
    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable String id){
        facultyService.deleteFacultyByID(id);
        return "Faculty deleted";
    }
    @PutMapping("update/{id}")
    public FacultyModel updateFaculty(@PathVariable String id, @RequestBody FacultyModel facultyModel){
        return facultyService.updateFaculty(id,facultyModel);
    }
}
