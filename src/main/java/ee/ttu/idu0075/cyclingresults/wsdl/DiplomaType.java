
package ee.ttu.idu0075.cyclingresults.wsdl;

import lombok.Data;

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
@Data
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

}
