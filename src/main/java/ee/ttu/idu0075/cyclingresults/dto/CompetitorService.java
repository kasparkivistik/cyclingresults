package ee.ttu.idu0075.cyclingresults.dto;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Competitor;
import ee.ttu.idu0075.cyclingresults.dao.CompetitorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompetitorService {

    private CompetitorRepository competitorRepository;

    public CompetitorService(CompetitorRepository competitorRepository) {
        this.competitorRepository = competitorRepository;
    }

    public Competitor save(Competitor competitor) {
        competitorRepository.add(competitor);
        return competitor;
    }

    public List<Competitor> findAll() {
        return competitorRepository.getCompetitors();
    }

    public Competitor findById(Long id) {
        Optional<Competitor> comp = competitorRepository.getCompetitors()
                .stream()
                .filter(competitor -> competitor.getId() == id)
                .findFirst();
        return comp.orElse(null);
    }
}
