package in.ac.saispurthi.webapi.controller;

import in.ac.saispurthi.webapi.model.PlacementsModel;
import in.ac.saispurthi.webapi.service.PlacementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/placements")
public class PlacementsController {
    @Autowired
    private PlacementsService placementsService;
    @PostMapping("/add")
    public PlacementsModel addPlacements(@RequestBody PlacementsModel placementsModel){
        return placementsService.addPlacement(placementsModel);
    }
    @GetMapping("/allPlacements")
    public List<PlacementsModel> allPlacements(){
        return placementsService.allPlacements();
    }
    @GetMapping("/placementsById/{htno}")
    public Optional<PlacementsModel> getPlacementById(@PathVariable String htno){
        return placementsService.placementById(htno);
    }
    @DeleteMapping("/delete/{htno}")
    public String deletePlacement(@PathVariable String htno){
        placementsService.deletePlacement(htno);
        return "Placement deleted";
    }
}
