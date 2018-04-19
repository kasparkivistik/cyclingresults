package ee.ttu.idu0075.cyclingresults.competition;

import ee.ttu.idu0075.cyclingresults.competitor.CompetitorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DiplomaService {

    @Resource
    private DiplomaRepository diplomaRepository;

    @Resource
    private CompetitorService competitorService;

    public Diploma save(Diploma diploma) {
        return diplomaRepository.save(diploma);
    }

    public List<Diploma> findAll() {
        return (List<Diploma>) diplomaRepository.findAll();
    }

    public Optional<Diploma> findById(Long id) {
        return diplomaRepository.findById(id);
    }

    public Optional<Diploma> setCompetitorToDiploma(Long diplomaId, Long competitorId) {
        Optional<Diploma> diploma = findById(diplomaId);
        diploma.ifPresent(diploma1 -> diploma1.setCompetitor(competitorService.findById(competitorId).get()));
        return diploma;
    }

}
