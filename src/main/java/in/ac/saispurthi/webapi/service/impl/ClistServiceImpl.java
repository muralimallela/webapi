package in.ac.saispurthi.webapi.service.impl;

import in.ac.saispurthi.webapi.model.ClistModel;
import in.ac.saispurthi.webapi.repository.ClistRepository;
import in.ac.saispurthi.webapi.service.ClistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClistServiceImpl implements ClistService {
    @Autowired
    private ClistRepository clistRepository;

    @Override
    public ClistModel addClist(ClistModel clistModel) {
        return clistRepository.save(clistModel);
    }

    @Override
    public List<ClistModel> getAllClist() {
        return clistRepository.findAll();
    }

    @Override
    public void deleteClist(int rid) {
        clistRepository.deleteById(rid);
    }

    @Override
    public Optional<ClistModel> getCListById(int rid) {
        return clistRepository.findById(rid);
    }

    @Override
    public ClistModel updateClist(int rid, ClistModel updatedCList) {
        Optional<ClistModel> existingCListOptional = clistRepository.findById(rid);

        if (existingCListOptional.isPresent()) {
            ClistModel existingCList = existingCListOptional.get();
            if (updatedCList.getName() != null) {
                existingCList.setName(updatedCList.getName());
            }
            if (updatedCList.getPosition() != null) {
                existingCList.setPosition(updatedCList.getPosition());
            }
            if (updatedCList.getType() != null) {
                existingCList.setType(updatedCList.getType());
            }

            // Save the updated entity
            return clistRepository.save(existingCList);
        } else {

            return null;
        }
    }
}
