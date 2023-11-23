package in.ac.saispurthi.webapi.service;

import in.ac.saispurthi.webapi.model.ClistModel;

import java.util.List;
import java.util.Optional;

public interface ClistService {
    public ClistModel addClist(ClistModel clistModel);
    public List<ClistModel> getAllClist();
    public void deleteClist(int rid);
    public Optional<ClistModel> getCListById(int rid);
    public ClistModel updateClist(int rid,ClistModel updatedCList);
}
