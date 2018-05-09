package ee.ttu.idu0075.cyclingresults.rest.competition;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DiplomaRepository extends CrudRepository<Diploma, Long> {

    @Query("FROM Diploma d WHERE d.competitor IS NOT NULL")
    List<Diploma> findAllCompetitorsWithDiplomas();
}
