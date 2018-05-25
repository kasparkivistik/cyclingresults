package ee.ttu.idu0075.cyclingresults.soap.competitor;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.*;
import ee.ttu.idu0075.cyclingresults.dto.CompetitorService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    public CompetitorEndpoint(CompetitorService competitorService) {
        this.competitorService = competitorService;
    }

    private static final String NAMESPACE_URI = "http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl";

    private CompetitorService competitorService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addCompetitorRequest")
    @ResponsePayload
    public AddCompetitorResponse save(@RequestPayload AddCompetitorRequest request) {
        AddCompetitorResponse response = new AddCompetitorResponse();
        if (request.getToken().equalsIgnoreCase("secrettoken123")) {
            Competitor competitor = new Competitor();
            competitor.setId(Math.abs(new Random().nextInt()));
            competitor.setName(request.getName());
            competitor.setPersonalCode(request.getPersonalCode());
            response.setCompetitor(competitor);
            competitorService.save(competitor);
            return response;
        }
        return null;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findAllCompetitorsRequest")
    @ResponsePayload
    public List<FindAllCompetitorsResponse> findAll(@RequestPayload FindAllCompetitorsRequest request) {
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

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findCompetitorByIdRequest")
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
