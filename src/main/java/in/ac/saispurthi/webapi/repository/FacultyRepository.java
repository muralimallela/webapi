package in.ac.saispurthi.webapi.repository;

import in.ac.saispurthi.webapi.model.FacultyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<FacultyModel,String> {
}
