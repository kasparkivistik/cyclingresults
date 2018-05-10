package ee.ttu.idu0075.cyclingresults.soap;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Competitor;
import ee.ttu.idu0075.cyclingresults.dao.CompetitorRepository;

import java.util.List;
import java.util.Optional;

public class CompetitorService {

    private CompetitorRepository competitorRepository;

    public Competitor save(Competitor competitor) {
        competitorRepository.add(competitor);
        return competitor;
    }

    public List<Competitor> findAll() {
        return competitorRepository.getCompetitors();
    }

    public Optional<Competitor> findById(Long id) {
        return competitorRepository.getCompetitors()
                .stream()
                .filter(competitor -> competitor.getId() == id)
                .findFirst();
    }
}
