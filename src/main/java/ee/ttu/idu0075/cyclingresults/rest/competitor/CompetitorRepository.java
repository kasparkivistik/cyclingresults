package ee.ttu.idu0075.cyclingresults.rest.competitor;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Competitor;

import java.util.List;
import java.util.Optional;

public interface CompetitorRepository {

    Competitor save(Competitor competitor);

    List<Competitor> findAll();

    Optional<Competitor> findById(Long id);
}
