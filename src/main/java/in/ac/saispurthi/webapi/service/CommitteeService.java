package in.ac.saispurthi.webapi.service;

import in.ac.saispurthi.webapi.model.CommitteeModel;
import in.ac.saispurthi.webapi.model.PlacementsModel;

import java.util.List;
import java.util.Optional;

public interface CommitteeService {
    public CommitteeModel addCommittee(CommitteeModel committeeModel);
    public List<CommitteeModel> allCommittee();
    public Optional<CommitteeModel> committeeById(int sno);
    public void deleteCommittee(int sno);
    public CommitteeModel updateCommittee(int sno, CommitteeModel committeeModel);

}
