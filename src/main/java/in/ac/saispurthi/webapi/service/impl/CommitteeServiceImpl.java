package in.ac.saispurthi.webapi.service.impl;

import in.ac.saispurthi.webapi.model.CommitteeModel;
import in.ac.saispurthi.webapi.repository.CommitteeRepository;
import in.ac.saispurthi.webapi.service.CommitteeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommitteeServiceImpl implements CommitteeService {
    @Autowired
    private CommitteeRepository committeeRepository;

    @Override
    public CommitteeModel addCommittee(CommitteeModel committeeModel) {
        return committeeRepository.save(committeeModel);
    }

    @Override
    public List<CommitteeModel> allCommittee() {
        return committeeRepository.findAll();
    }

    @Override
    public Optional<CommitteeModel> committeeById(int sno) {
        return committeeRepository.findById(sno);
    }

    @Override
    public void deleteCommittee(int sno) {
        committeeRepository.deleteById(sno);
    }

    @Override
    public CommitteeModel updateCommittee(int sno, CommitteeModel committeeModel) {
        return null;
    }
}
