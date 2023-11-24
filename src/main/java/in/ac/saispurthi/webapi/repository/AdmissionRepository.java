package in.ac.saispurthi.webapi.repository;

import in.ac.saispurthi.webapi.model.AdmissionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmissionRepository extends JpaRepository<AdmissionModel,String> {
}
