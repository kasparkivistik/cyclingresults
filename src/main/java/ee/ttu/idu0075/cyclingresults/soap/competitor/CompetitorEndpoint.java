package ee.ttu.idu0075.cyclingresults.soap.competitor;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.*;
import ee.ttu.idu0075.cyclingresults.dto.CompetitorService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Endpoint
public class CompetitorEndpoint {
    private static final String NAMESPACE_URI = "http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl";

    private CompetitorService competitorService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addCompetitor")
    @ResponsePayload
    public Competitor save(@RequestPayload AddCompetitorRequest request) {
        Competitor competitor = new Competitor();
        if (request.getToken().equalsIgnoreCase("secrettoken123")) {
            competitor.setId(Math.abs(new Random().nextLong()));
            competitor.setName(request.getName());
            competitor.setPersonalCode(request.getPersonalCode());
            competitorService.save(competitor);
            return competitor;
        }
        return null;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findAllCompetitors")
    @ResponsePayload
    public List<FindAllCompetitorsResponse> findAll(FindAllCompetitorsRequest request) {
        List<FindAllCompetitorsResponse> response = new ArrayList<>();
        if (request.getToken().equalsIgnoreCase("secrettoken123")) {
            List<Competitor> competitors = competitorService.findAll();
            competitors.forEach(competitor -> {
                FindAllCompetitorsResponse resp = new FindAllCompetitorsResponse();
                resp.getCompetitor().add(competitor);
                response.add(resp);
            });
            return response;
        }
        return null;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findCompetitorById")
    @ResponsePayload
    public Optional<FindCompetitorByIdResponse> findById(FindCompetitorByIdRequest request) {
        if (request.getToken().equalsIgnoreCase("secrettoken123")) {
            Optional<Competitor> competitor = competitorService.findById(request.getId());
            FindCompetitorByIdResponse response = new FindCompetitorByIdResponse();
            response.setCompetitor(competitor.get());
            return Optional.of(response);
        }
        return Optional.empty();
    }
}
