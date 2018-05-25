package ee.ttu.idu0075.cyclingresults.dao;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Competitor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CompetitorRepository {

    private List<Competitor> competitors = new ArrayList<>();

    public void add(Competitor competitor) {
        competitors.add(competitor);
    }

    public List<Competitor> getCompetitors() {
        return competitors;
    }
}
