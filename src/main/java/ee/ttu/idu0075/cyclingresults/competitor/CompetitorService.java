package ee.ttu.idu0075.cyclingresults.competitor;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class CompetitorService {

    @Resource
    private CompetitorRepository competitorRepository;

    public Competitor save(Competitor competitor) {
        return competitorRepository.save(competitor);
    }

    public List<Competitor> findAll() {
        return (List<Competitor>) competitorRepository.findAll();
    }

    public Optional<Competitor> findById(Long id) {
        return competitorRepository.findById(id);
    }
}
