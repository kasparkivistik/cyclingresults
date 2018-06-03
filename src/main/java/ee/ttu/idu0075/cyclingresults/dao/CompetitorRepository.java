package ee.ttu.idu0075.cyclingresults.dao;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Competitor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CompetitorRepository {

    private List<Competitor> competitors = new ArrayList<>();
    private static long ID = 0;

    public CompetitorRepository() {
        Competitor competitor = new Competitor();
        competitor.setName("Toomas Uba");
        competitor.setId(ID++);
        competitor.setPersonalCode("38120402813");
        competitors.add(competitor);

        Competitor competitor2 = new Competitor();
        competitor2.setId(ID++);
        competitor2.setName("Peeter Peet");
        competitor2.setPersonalCode("31934125521");
        competitors.add(competitor2);
    }

    public void add(Competitor competitor) {
        competitor.setId(ID++);
        competitors.add(competitor);
    }

    public List<Competitor> getCompetitors() {
        return competitors;
    }
}
