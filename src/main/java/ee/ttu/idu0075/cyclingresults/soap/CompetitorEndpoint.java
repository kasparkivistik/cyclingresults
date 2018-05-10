package ee.ttu.idu0075.cyclingresults.soap;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.AddCompetitorRequest;
import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Competitor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Random;

@Endpoint
public class CompetitorEndpoint {
    private static final String NAMESPACE_URI = "http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addCompetitor")
    @ResponsePayload
    public Competitor addCompetitor(@RequestPayload AddCompetitorRequest competitor) {
        if (competitor.getToken().equalsIgnoreCase("secrettoken123")) {
            Competitor response = new Competitor();
            response.setId(new Random().nextLong());
            response.setName(competitor.getName());
            response.setPersonalCode(competitor.getPersonalCode());
            return response;
        }
        return null;
    }

}
