package in.ac.saispurthi.webapi.controller;

import in.ac.saispurthi.webapi.model.ClistModel;
import in.ac.saispurthi.webapi.service.ClistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/clist")
public class ClistController {
    @Autowired
    private ClistService clistService;
    @PostMapping("/add")
    public String addClist(@RequestBody ClistModel clistModel){
        clistService.addClist(clistModel);
        return "Clist added";
    }
    @GetMapping("/allClist")
    public List<ClistModel> getAllClist(){
        return clistService.getAllClist();
    }
    @GetMapping("clistById/{rid}")
    public Optional<ClistModel> getClistByID(@PathVariable int rid){
        return clistService.getCListById(rid);
    }
    @DeleteMapping("delete/{rid}")
    public String deleteClist(@PathVariable int rid){
        clistService.deleteClist(rid);
        return "Clist deleted";
    }
    @PutMapping("update/{rid}")
    public ClistModel updateClist(@PathVariable int rid,@RequestBody ClistModel clistModel){
        return clistService.updateClist(rid,clistModel);
    }
}
