
package ee.ttu.idu0075.cyclingresults.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="competitor" type="{http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl}competitorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "competitor"
})
@XmlRootElement(name = "findCompetitorByIdResponse")
public class FindCompetitorByIdResponse {

    protected CompetitorType competitor;

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
