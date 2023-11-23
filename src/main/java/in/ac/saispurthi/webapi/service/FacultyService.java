package in.ac.saispurthi.webapi.service;

import in.ac.saispurthi.webapi.model.FacultyModel;

import java.util.List;
import java.util.Optional;

public interface FacultyService {
    public FacultyModel addFaculty(FacultyModel facultyModel);
    public List<FacultyModel> facultyLIst();
    public Optional<FacultyModel> getFacultyByID(String id);
    public void deleteFacultyByID(String id);
    public FacultyModel updateFaculty(String id,FacultyModel facultyModel);
}
