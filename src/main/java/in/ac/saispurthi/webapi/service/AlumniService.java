package in.ac.saispurthi.webapi.service;

import in.ac.saispurthi.webapi.model.AlumniModel;

import java.util.List;
import java.util.Optional;

public interface AlumniService {
    public AlumniModel addAlumni(AlumniModel alumniModel);
    public List<AlumniModel> alumniList();
    public Optional<AlumniModel> getAlumniById(String id);
    public void deleteAlumni(String id);
    public AlumniModel updateAlumni(String id, AlumniModel alumniModel);
}
