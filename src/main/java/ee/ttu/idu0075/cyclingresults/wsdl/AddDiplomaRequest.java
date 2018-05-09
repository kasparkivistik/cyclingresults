
package ee.ttu.idu0075.cyclingresults.wsdl;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="event" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeOfEvent" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="placement" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ageGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "token",
        "event",
        "timeOfEvent",
        "time",
        "placement",
        "ageGroup"
})
@XmlRootElement(name = "addDiplomaRequest")
@Data
public class AddDiplomaRequest {

    @XmlElement(required = true)
    protected String token;
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

}
