package in.ac.saispurthi.webapi.service.impl;

import in.ac.saispurthi.webapi.model.FacultyModel;
import in.ac.saispurthi.webapi.repository.FacultyRepository;
import in.ac.saispurthi.webapi.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyServiceImpl implements FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;
    @Override
    public FacultyModel addFaculty(FacultyModel facultyModel) {
        return facultyRepository.save(facultyModel);
    }

    @Override
    public List<FacultyModel> facultyLIst() {
        return  facultyRepository.findAll();
    }

    @Override
    public Optional<FacultyModel> getFacultyByID(String id) {
        return facultyRepository.findById(id);
    }

    @Override
    public void deleteFacultyByID(String id) {
        facultyRepository.deleteById(id);
    }

    @Override
    public FacultyModel updateFaculty(String id, FacultyModel facultyModel) {
        FacultyModel faculty = facultyRepository.findById(id).orElseThrow(()->new RuntimeException());
        faculty.setFname(facultyModel.getFname());
        faculty.setFdept(facultyModel.getFdept());
        faculty.setFexp(facultyModel.getFexp());
        faculty.setFdob(facultyModel.getFdob());
        faculty.setFqualification(facultyModel.getFqualification());
        faculty.setFmobile(facultyModel.getFmobile());
        faculty.setFotherqual(facultyModel.getFotherqual());
        faculty.setFstream(facultyModel.getFstream());
        faculty.setStatus(facultyModel.getStatus());
        faculty.setFdesignation(facultyModel.getFdesignation());
        faculty.setFemail(facultyModel.getFemail()  );
        return facultyRepository.save(faculty);
    }
}
