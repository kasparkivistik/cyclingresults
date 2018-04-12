package ee.ttu.idu0075.cyclingresults.competitor;

import ee.ttu.idu0075.cyclingresults.competition.Diploma;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Competitor {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany
    private List<Diploma> diplomas;
}
