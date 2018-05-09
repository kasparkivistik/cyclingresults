
package ee.ttu.idu0075.cyclingresults.wsdl;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for diplomaType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="diplomaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="event" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeOfEvent" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="placement" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ageGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="competitor" type="{http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl}competitorType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diplomaType", propOrder = {
        "id",
        "event",
        "timeOfEvent",
        "time",
        "placement",
        "ageGroup",
        "competitor"
})
public class DiplomaType {

    protected long id;
    @XmlElement(required = true)
    protected String event;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeOfEvent;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    protected long placement;
    @XmlElement(required = true)
    protected String ageGroup;
    @XmlElement(required = true)
    protected CompetitorType competitor;

    /**
     * Gets the value of the id property.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the event property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEvent(String value) {
        this.event = value;
    }

    /**
     * Gets the value of the timeOfEvent property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getTimeOfEvent() {
        return timeOfEvent;
    }

    /**
     * Sets the value of the timeOfEvent property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setTimeOfEvent(XMLGregorianCalendar value) {
        this.timeOfEvent = value;
    }

    /**
     * Gets the value of the time property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the placement property.
     */
    public long getPlacement() {
        return placement;
    }

    /**
     * Sets the value of the placement property.
     */
    public void setPlacement(long value) {
        this.placement = value;
    }

    /**
     * Gets the value of the ageGroup property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAgeGroup() {
        return ageGroup;
    }

    /**
     * Sets the value of the ageGroup property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAgeGroup(String value) {
        this.ageGroup = value;
    }

    /**
     * Gets the value of the competitor property.
     *
     * @return possible object is
     * {@link CompetitorType }
     */
    public CompetitorType getCompetitor() {
        return competitor;
    }

    /**
     * Sets the value of the competitor property.
     *
     * @param value allowed object is
     *              {@link CompetitorType }
     */
    public void setCompetitor(CompetitorType value) {
        this.competitor = value;
    }

}
