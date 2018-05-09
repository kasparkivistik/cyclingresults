
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
 *         &lt;element name="diploma" type="{http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl}diplomaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "diploma"
})
@XmlRootElement(name = "findDiplomaByIdResponse")
public class FindDiplomaByIdResponse {

    protected DiplomaType diploma;

    /**
     * Gets the value of the diploma property.
     *
     * @return possible object is
     * {@link DiplomaType }
     */
    public DiplomaType getDiploma() {
        return diploma;
    }

    /**
     * Sets the value of the diploma property.
     *
     * @param value allowed object is
     *              {@link DiplomaType }
     */
    public void setDiploma(DiplomaType value) {
        this.diploma = value;
    }

}
