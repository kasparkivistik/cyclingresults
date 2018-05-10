package ee.ttu.idu0075.cyclingresults.dao;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Competitor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompetitorRepository {

    private static List<Competitor> competitors;

    public static void setCompetitors(List<Competitor> competitors) {
        CompetitorRepository.competitors = competitors;
    }

    public void add(Competitor competitor) {
        competitors.add(competitor);
    }

    public List<Competitor> getCompetitors() {
        return competitors;
    }
}
