package ee.ttu.idu0075.cyclingresults.rest.diploma;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Diploma;

import java.util.List;
import java.util.Optional;

public interface DiplomaRepository {

    Diploma save(Diploma diploma);

    List<Diploma> findAll();

    Optional<Diploma> findById(Long id);

    Optional<Diploma> setCompetitorToDiploma(Long diplomaId, Long competitorId);
    List<Diploma> findAllCompetitorsWithDiplomas();
}
