package in.ac.saispurthi.webapi.repository;

import in.ac.saispurthi.webapi.model.PlacementsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacementsRepository extends JpaRepository<PlacementsModel,String> {
}
