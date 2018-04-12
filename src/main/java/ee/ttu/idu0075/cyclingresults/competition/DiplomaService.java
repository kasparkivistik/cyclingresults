package ee.ttu.idu0075.cyclingresults.competition;

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

    public Diploma save(Diploma diploma) {
        return diplomaRepository.save(diploma);
    }

    public List<Diploma> findAll() {
        return (List<Diploma>) diplomaRepository.findAll();
    }

    public Optional<Diploma> findById(Long id) {
        return diplomaRepository.findById(id);
    }
}
