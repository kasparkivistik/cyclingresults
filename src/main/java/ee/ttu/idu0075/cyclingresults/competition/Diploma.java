package ee.ttu.idu0075.cyclingresults.competition;


import ee.ttu.idu0075.cyclingresults.competitor.Competitor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
public class Diploma {
    @Id
    @GeneratedValue
    private Long id;
    private Long event;

    private Date timeOfEvent;
    private String time;
    private Long placement;
    private String ageGroup;
    @ManyToOne
    private Competitor competitor;
}
