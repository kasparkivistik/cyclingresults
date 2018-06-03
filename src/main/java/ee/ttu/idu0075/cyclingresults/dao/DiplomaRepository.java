package ee.ttu.idu0075.cyclingresults.dao;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Competitor;
import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Diploma;
import org.springframework.stereotype.Repository;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DiplomaRepository {

    private List<Diploma> diplomas = new ArrayList<>();
    private static long ID = 0;

    public DiplomaRepository() {
        Competitor competitor = new Competitor();
        competitor.setName("Toomas Uba");
        competitor.setId(0);
        competitor.setPersonalCode("38120402813");

        XMLGregorianCalendar diplomaTime = new XMLGregorianCalendarImpl();
        diplomaTime.setTime(2, 22, 32);

        XMLGregorianCalendar diplomaTimeOfEvent = new XMLGregorianCalendarImpl();
        diplomaTimeOfEvent.setYear(2018);
        diplomaTimeOfEvent.setMonth(5);
        diplomaTimeOfEvent.setDay(28);

        Diploma diploma = new Diploma();
        diploma.setAgeGroup("M18");
        diploma.setEvent("Tartu Rattaralli");
        diploma.setCompetitor(competitor);
        diploma.setId(ID++);
        diploma.setPlacement(234);
        diploma.setTime(diplomaTime);
        diploma.setTimeOfEvent(diplomaTimeOfEvent);
        diplomas.add(diploma);

        Diploma diploma1 = new Diploma();
        diploma1.setAgeGroup("M16");
        diploma1.setEvent("Tartu Rattaralli");
        diploma1.setId(ID++);
        diploma1.setPlacement(123);
        diploma1.setTime(diplomaTime);
        diploma1.setTimeOfEvent(diplomaTimeOfEvent);
        diplomas.add(diploma1);
    }


    public void add(Diploma diploma) {
        diploma.setId(ID++);
        diplomas.add(diploma);
    }

    public List<Diploma> getDiplomas() {
        return diplomas;
    }
}
