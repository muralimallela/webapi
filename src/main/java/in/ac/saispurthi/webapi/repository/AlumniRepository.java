package in.ac.saispurthi.webapi.repository;

import in.ac.saispurthi.webapi.model.AlumniModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumniRepository extends JpaRepository<AlumniModel,String> {
}
