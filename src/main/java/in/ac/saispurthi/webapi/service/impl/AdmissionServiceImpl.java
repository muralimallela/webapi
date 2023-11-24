package in.ac.saispurthi.webapi.service.impl;

import in.ac.saispurthi.webapi.model.AdmissionModel;
import in.ac.saispurthi.webapi.repository.AdmissionRepository;
import in.ac.saispurthi.webapi.service.AdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdmissionServiceImpl implements AdmissionService {
    @Autowired
    private AdmissionRepository admissionRepository;
    @Override
    public AdmissionModel addAdmission(AdmissionModel admissionFormModel) {
        return admissionRepository.save(admissionFormModel);
    }

    @Override
    public List<AdmissionModel> allAdmissions() {
        return admissionRepository.findAll();
    }

    @Override
    public Optional<AdmissionModel> admissionById(String id) {
        return admissionRepository.findById(id);
    }

    @Override
    public void deleteAdmission(String id) {
        admissionRepository.deleteById(id);
    }

    @Override
    public AdmissionModel updateAdmission(String id, AdmissionModel admissionFormModel) {
        return null;
    }
}
