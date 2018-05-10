package ee.ttu.idu0075.cyclingresults.soap;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Diploma;
import ee.ttu.idu0075.cyclingresults.dao.DiplomaRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DiplomaService {

    private DiplomaRepository diplomaRepository;

    private CompetitorService competitorService;

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

    public List<Diploma> findAllCompetitorsWithDiplomas() {
        return diplomaRepository.getDiplomas()
                .stream()
                .filter(diploma -> diploma.getCompetitor() != null)
                .collect(Collectors.toList());
    }
}
