package ee.ttu.idu0075.cyclingresults.dao;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Competitor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class CompetitorRepository {

    private List<Competitor> competitors;

    public void add(Competitor competitor) {
        competitors.add(competitor);
    }
}
