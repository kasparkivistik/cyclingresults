package ee.ttu.idu0075.cyclingresults.rest.competitor;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Competitor;
import ee.ttu.idu0075.cyclingresults.dao.CompetitorRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class CompetitorService {

    private CompetitorRepository competitors;

    public Competitor save(Competitor competitor) {
        competitors.add(competitor);
        return competitor;
    }

    public List<Competitor> findAll() {
        return competitors.getCompetitors();
    }

    public Optional<Competitor> findById(Long id) {
        return competitors.getCompetitors()
                .stream()
                .filter(competitor -> competitor.getId() == id)
                .findFirst();
    }
}
