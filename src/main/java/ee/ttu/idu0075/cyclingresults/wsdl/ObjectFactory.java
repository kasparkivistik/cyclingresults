
package ee.ttu.idu0075.cyclingresults.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the ee.ttu.idu0075.cyclingresults.wsdl package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddDiplomaResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl", "addDiplomaResponse");
    private final static QName _SetCompetitorToDiplomaResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl", "setCompetitorToDiplomaResponse");
    private final static QName _AddCompetitorResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl", "addCompetitorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075.cyclingresults.wsdl
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompetitorType }
     */
    public CompetitorType createCompetitorType() {
        return new CompetitorType();
    }

    /**
     * Create an instance of {@link FindAllDiplomasResponse }
     */
    public FindAllDiplomasResponse createFindAllDiplomasResponse() {
        return new FindAllDiplomasResponse();
    }

    /**
     * Create an instance of {@link DiplomaType }
     */
    public DiplomaType createDiplomaType() {
        return new DiplomaType();
    }

    /**
     * Create an instance of {@link FindDiplomaByIdResponse }
     */
    public FindDiplomaByIdResponse createFindDiplomaByIdResponse() {
        return new FindDiplomaByIdResponse();
    }

    /**
     * Create an instance of {@link AddCompetitorRequest }
     */
    public AddCompetitorRequest createAddCompetitorRequest() {
        return new AddCompetitorRequest();
    }

    /**
     * Create an instance of {@link FindDiplomaByIdRequest }
     */
    public FindDiplomaByIdRequest createFindDiplomaByIdRequest() {
        return new FindDiplomaByIdRequest();
    }

    /**
     * Create an instance of {@link FindAllCompetitorsRequest }
     */
    public FindAllCompetitorsRequest createFindAllCompetitorsRequest() {
        return new FindAllCompetitorsRequest();
    }

    /**
     * Create an instance of {@link FindAllCompetitorsResponse }
     */
    public FindAllCompetitorsResponse createFindAllCompetitorsResponse() {
        return new FindAllCompetitorsResponse();
    }

    /**
     * Create an instance of {@link FindAllCompetitorsWithDiplomasResponse }
     */
    public FindAllCompetitorsWithDiplomasResponse createFindAllCompetitorsWithDiplomasResponse() {
        return new FindAllCompetitorsWithDiplomasResponse();
    }

    /**
     * Create an instance of {@link FindCompetitorByIdRequest }
     */
    public FindCompetitorByIdRequest createFindCompetitorByIdRequest() {
        return new FindCompetitorByIdRequest();
    }

    /**
     * Create an instance of {@link FindAllCompetitorsWithDiplomasRequest }
     */
    public FindAllCompetitorsWithDiplomasRequest createFindAllCompetitorsWithDiplomasRequest() {
        return new FindAllCompetitorsWithDiplomasRequest();
    }

    /**
     * Create an instance of {@link AddDiplomaRequest }
     */
    public AddDiplomaRequest createAddDiplomaRequest() {
        return new AddDiplomaRequest();
    }

    /**
     * Create an instance of {@link SetCompetitorToDiplomaRequest }
     */
    public SetCompetitorToDiplomaRequest createSetCompetitorToDiplomaRequest() {
        return new SetCompetitorToDiplomaRequest();
    }

    /**
     * Create an instance of {@link FindAllDiplomasRequest }
     */
    public FindAllDiplomasRequest createFindAllDiplomasRequest() {
        return new FindAllDiplomasRequest();
    }

    /**
     * Create an instance of {@link FindCompetitorByIdResponse }
     */
    public FindCompetitorByIdResponse createFindCompetitorByIdResponse() {
        return new FindCompetitorByIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiplomaType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl", name = "addDiplomaResponse")
    public JAXBElement<DiplomaType> createAddDiplomaResponse(DiplomaType value) {
        return new JAXBElement<DiplomaType>(_AddDiplomaResponse_QNAME, DiplomaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiplomaType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl", name = "setCompetitorToDiplomaResponse")
    public JAXBElement<DiplomaType> createSetCompetitorToDiplomaResponse(DiplomaType value) {
        return new JAXBElement<DiplomaType>(_SetCompetitorToDiplomaResponse_QNAME, DiplomaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetitorType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl", name = "addCompetitorResponse")
    public JAXBElement<CompetitorType> createAddCompetitorResponse(CompetitorType value) {
        return new JAXBElement<CompetitorType>(_AddCompetitorResponse_QNAME, CompetitorType.class, null, value);
    }

}
