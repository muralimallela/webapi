package in.ac.saispurthi.webapi.service;

import in.ac.saispurthi.webapi.model.AdmissionModel;

import java.util.List;
import java.util.Optional;

public interface AdmissionService {
    public AdmissionModel addAdmission(AdmissionModel admissionFormModel);
    public List<AdmissionModel> allAdmissions();
    public Optional<AdmissionModel> admissionById(String id);
    public void deleteAdmission(String id);
    public AdmissionModel updateAdmission(String id, AdmissionModel admissionFormModel);
}
