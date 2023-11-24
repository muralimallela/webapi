package in.ac.saispurthi.webapi.service;

import in.ac.saispurthi.webapi.model.PlacementsModel;

import java.util.List;
import java.util.Optional;

public interface PlacementsService {
    public PlacementsModel addPlacement(PlacementsModel placementsModel);
    public List<PlacementsModel> allPlacements();
    public Optional<PlacementsModel> placementById(String htno);
    public void deletePlacement(String htno);
    public Optional<PlacementsModel> updatePlacement(String htno,PlacementsModel placementsModel);
}
