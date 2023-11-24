package in.ac.saispurthi.webapi.repository;

import in.ac.saispurthi.webapi.model.CommitteeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommitteeRepository extends JpaRepository<CommitteeModel,Integer> {
}
