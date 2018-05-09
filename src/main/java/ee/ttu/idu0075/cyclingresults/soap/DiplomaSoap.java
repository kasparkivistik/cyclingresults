package ee.ttu.idu0075.cyclingresults.soap;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.AddCompetitorRequest;
import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.CompetitorType;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Random;

@Endpoint
public class DiplomaSoap {
    private static final String NAMESPACE_URI = "http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addCompetitorRequest")
    @ResponsePayload
    public CompetitorType addCompetitor(@RequestPayload AddCompetitorRequest competitor) {
        if (competitor.getToken().equalsIgnoreCase("secrettoken123")) {
            CompetitorType response = new CompetitorType();
            response.setId(new Random().nextLong());
            response.setName(competitor.getName());
            response.setPersonalCode(competitor.getPersonalCode());
            return response;
        }
        return new CompetitorType();
    }
}
