package in.ac.saispurthi.webapi.service.impl;

import in.ac.saispurthi.webapi.model.PlacementsModel;
import in.ac.saispurthi.webapi.repository.PlacementsRepository;
import in.ac.saispurthi.webapi.service.PlacementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PlacementsServiceImpl implements PlacementsService {
    @Autowired
    private PlacementsRepository placementsRepository;
    @Override
    public PlacementsModel addPlacement(PlacementsModel placementsModel) {
        return placementsRepository.save(placementsModel);
    }

    @Override
    public List<PlacementsModel> allPlacements() {
        return placementsRepository.findAll();
    }

    @Override
    public Optional<PlacementsModel> placementById(String htno) {
        return placementsRepository.findById(htno);
    }

    @Override
    public void deletePlacement(String htno) {
        placementsRepository.deleteById(htno);
    }

    @Override
    public Optional<PlacementsModel> updatePlacement(String htno, PlacementsModel placementsModel) {
        return Optional.empty();
    }
}
