package ee.ttu.idu0075.cyclingresults.rest.diploma;


import ee.ttu.idu0075.cyclingresults.rest.competitor.Competitor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class Diploma {
    @Id
    @GeneratedValue
    private Long id;
    private String event;
    private Date timeOfEvent;
    private LocalDateTime time;
    private Long placement;
    private String ageGroup;
    @ManyToOne
    private Competitor competitor;
}
