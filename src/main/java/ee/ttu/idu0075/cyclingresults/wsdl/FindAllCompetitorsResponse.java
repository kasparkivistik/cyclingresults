
package ee.ttu.idu0075.cyclingresults.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="competitor" type="{http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl}competitorType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "findAllCompetitorsResponse")
public class FindAllCompetitorsResponse {

    protected List<CompetitorType> competitor;

    /**
     * Gets the value of the competitor property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competitor property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetitor().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetitorType }
     */
    public List<CompetitorType> getCompetitor() {
        if (competitor == null) {
            competitor = new ArrayList<CompetitorType>();
        }
        return this.competitor;
    }

}
