package in.ac.saispurthi.webapi.repository;

import in.ac.saispurthi.webapi.model.ClistModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClistRepository extends JpaRepository<ClistModel,Integer> {
}
