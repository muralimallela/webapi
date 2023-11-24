package in.ac.saispurthi.webapi.controller;

import in.ac.saispurthi.webapi.model.CommitteeModel;
import in.ac.saispurthi.webapi.service.CommitteeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/committee")
public class CommitteeController {
    @Autowired
    private CommitteeService committeeService;
    @PostMapping("/add")
    public CommitteeModel addCommittee(@RequestBody CommitteeModel committeeModel){
        return committeeService.addCommittee(committeeModel);
    }
    @GetMapping("/allCommittees")
    public List<CommitteeModel> allCommittees(){
        return committeeService.allCommittee();
    }
    @GetMapping("/committeeByID/{sno}")
    public Optional<CommitteeModel> getCommitteebyId(@PathVariable int sno){
        return committeeService.committeeById(sno);
    }
    @DeleteMapping("/delete/{sno}")
    public String deleteCommittee(@PathVariable int sno){
        committeeService.deleteCommittee(sno);
        return "Committee deleted";
    }
}
