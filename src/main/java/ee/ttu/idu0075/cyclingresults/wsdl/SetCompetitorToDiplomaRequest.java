
package ee.ttu.idu0075.cyclingresults.wsdl;

import lombok.Data;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="diplomaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="competitorId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "token",
        "diplomaId",
        "competitorId"
})
@XmlRootElement(name = "setCompetitorToDiplomaRequest")
@Data
public class SetCompetitorToDiplomaRequest {

    @XmlElement(required = true)
    protected String token;
    protected long diplomaId;
    protected long competitorId;
}
