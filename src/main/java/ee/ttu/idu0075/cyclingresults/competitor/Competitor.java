package ee.ttu.idu0075.cyclingresults.competitor;

import ee.ttu.idu0075.cyclingresults.competition.Diploma;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Competitor {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "competitor_name")
    private String name;
    @OneToMany
    private List<Diploma> diplomas;
}
