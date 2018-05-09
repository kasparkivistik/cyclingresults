package ee.ttu.idu0075.cyclingresults.rest.competitor;

import ee.ttu.idu0075.cyclingresults.rest.diploma.Diploma;
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
    private String personalCode;
    @OneToMany
    private List<Diploma> diplomas;
}
