package ee.ttu.idu0075.cyclingresults.dao;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Diploma;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class DiplomaRepository {

    private List<Diploma> diplomas;

    public void add(Diploma diploma) {
        diplomas.add(diploma);
    }
}
