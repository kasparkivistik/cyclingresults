package ee.ttu.idu0075.cyclingresults.dao;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Diploma;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DiplomaRepository {

    private List<Diploma> diplomas = new ArrayList<>();


    public void add(Diploma diploma) {
        diplomas.add(diploma);
    }

    public List<Diploma> getDiplomas() {
        return diplomas;
    }
}
