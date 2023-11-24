package in.ac.saispurthi.webapi.service.impl;

import in.ac.saispurthi.webapi.model.AlumniModel;
import in.ac.saispurthi.webapi.repository.AlumniRepository;
import in.ac.saispurthi.webapi.service.AlumniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumniServiceImpl implements AlumniService {
    @Autowired
    private AlumniRepository alumniRepository;
    @Override
    public AlumniModel addAlumni(AlumniModel alumniModel) {
        return alumniRepository.save(alumniModel);
    }

    @Override
    public List<AlumniModel> alumniList() {
        return alumniRepository.findAll();
    }

    @Override
    public Optional<AlumniModel> getAlumniById(String id) {
        return alumniRepository.findById(id);
    }

    @Override
    public void deleteAlumni(String id) {
        alumniRepository.deleteById(id);
    }

    @Override
    public AlumniModel updateAlumni(String id, AlumniModel alumniModel) {
        return null;
    }
}
