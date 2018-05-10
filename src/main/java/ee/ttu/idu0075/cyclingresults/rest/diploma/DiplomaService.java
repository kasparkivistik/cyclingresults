package ee.ttu.idu0075.cyclingresults.rest.diploma;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Diploma;
import ee.ttu.idu0075.cyclingresults.rest.competitor.CompetitorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class DiplomaService implements DiplomaRepository {

    static List<Diploma> diplomas = new ArrayList<>();

    @Resource
    private CompetitorService competitorService;

    public Diploma save(Diploma diploma) {
        diplomas.add(diploma);
        return diploma;
    }

    public List<Diploma> findAll() {
        return diplomas;
    }

    public Optional<Diploma> findById(Long id) {
        return diplomas.stream()
                .filter(diploma -> diploma.getId() == id)
                .findFirst();
    }

    public Optional<Diploma> setCompetitorToDiploma(Long diplomaId, Long competitorId) {
        Optional<Diploma> diploma = findById(diplomaId);
        diploma.ifPresent(diploma1 -> diploma1.setCompetitor(competitorService.findById(competitorId).get()));
        return diploma;
    }

    public List<Diploma> findAllCompetitorsWithDiplomas() {
        return diplomas.stream()
                .filter(diploma -> diploma.getCompetitor() != null)
                .collect(Collectors.toList());
    }
}
