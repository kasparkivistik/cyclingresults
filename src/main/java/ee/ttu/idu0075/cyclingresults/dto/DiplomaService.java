package ee.ttu.idu0075.cyclingresults.dto;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Diploma;
import ee.ttu.idu0075.cyclingresults.dao.DiplomaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DiplomaService {

    private DiplomaRepository diplomaRepository;

    private CompetitorService competitorService;

    public DiplomaService(DiplomaRepository diplomaRepository, CompetitorService competitorService) {
        this.diplomaRepository = diplomaRepository;
        this.competitorService = competitorService;
    }

    public Diploma save(Diploma diploma) {
        diplomaRepository.add(diploma);
        return diploma;
    }

    public List<Diploma> findAll() {
        return diplomaRepository.getDiplomas();
    }

    public Optional<Diploma> findById(Long id) {
        return diplomaRepository.getDiplomas()
                .stream()
                .filter(diploma -> diploma.getId() == id)
                .findFirst();
    }

    public Optional<Diploma> setCompetitorToDiploma(Long diplomaId, Long competitorId) {
        Optional<Diploma> diploma = findById(diplomaId);
        diploma.ifPresent(diploma1 -> diploma1.setCompetitor(competitorService.findById(competitorId).get()));
        return diploma;

    }

    public List<Diploma> findAllDiplomasWithCompetitor() {
        return diplomaRepository.getDiplomas()
                .stream()
                .filter(diploma -> diploma.getCompetitor() != null)
                .collect(Collectors.toList());
    }
}
