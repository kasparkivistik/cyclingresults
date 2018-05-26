package ee.ttu.idu0075.cyclingresults.soap.diploma;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.*;
import ee.ttu.idu0075.cyclingresults.dao.CompetitorRepository;
import ee.ttu.idu0075.cyclingresults.dto.CompetitorService;
import ee.ttu.idu0075.cyclingresults.dto.DiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;
 import java.util.Random;

@Endpoint
public class DiplomaEndpoint {
    private static final String NAMESPACE_URI = "http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl";

    private DiplomaService diplomaService;

    private CompetitorService competitorService;

    @Autowired
    public DiplomaEndpoint(DiplomaService diplomaService, CompetitorService competitorService) {
        this.diplomaService = diplomaService;
        this.competitorService = competitorService;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addDiplomaRequest")
    @ResponsePayload
    public AddDiplomaResponse save(@RequestPayload AddDiplomaRequest request) {
        AddDiplomaResponse response = new AddDiplomaResponse();
        if (request.getToken().equalsIgnoreCase("secrettoken123")) {
            Diploma diploma = new Diploma();
            diploma.setId(Math.abs(new Random().nextInt()));
            diploma.setEvent(request.getEvent());
            diploma.setAgeGroup(request.getAgeGroup().toString());
            diploma.setPlacement(request.getPlacement());
            diploma.setTime(request.getTime());
            diploma.setTimeOfEvent(request.getTime());
            response.setDiploma(diploma);
            diplomaService.save(diploma);
            return response;
        }
        throw new RuntimeException("Invalid token!");
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findDiplomaByIdRequest")
    @ResponsePayload
    public FindDiplomaByIdResponse findById(@RequestPayload FindDiplomaByIdRequest request) {
        FindDiplomaByIdResponse response = new FindDiplomaByIdResponse();
        if (request.getToken().equalsIgnoreCase("secrettoken123")) {
            Diploma diploma = diplomaService.findById(request.getId());
            response.setDiploma(diploma);
            return response;
        }
        throw new RuntimeException("Invalid token!");
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findAllDiplomasRequest")
    @ResponsePayload
    public FindAllDiplomasResponse findAll(@RequestPayload FindAllDiplomasRequest request) {
        FindAllDiplomasResponse response = new FindAllDiplomasResponse();
        if (request.getToken().equalsIgnoreCase("secettoken123")) {
            List<Diploma> diplomas = diplomaService.findAll();
            response.getDiploma().addAll(diplomas);
            return response;
        }
        throw new RuntimeException("Invalid token!");
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "setCompetitorToDiplomaRequest")
    @ResponsePayload
    public SetCompetitorToDiplomaResponse setCompetitorToDiploma(@RequestPayload SetCompetitorToDiplomaRequest request) {
        SetCompetitorToDiplomaResponse response = new SetCompetitorToDiplomaResponse();
        if (request.getToken().equalsIgnoreCase("secrettoken123")) {
            Diploma diploma = diplomaService.findById(request.getDiplomaId());
            Competitor competitor = competitorService.findById(request.getCompetitorId());
            diploma.setCompetitor(competitor);
            response.setDiploma(diploma);
            diplomaService.setCompetitorToDiploma(request.getDiplomaId(), request.getCompetitorId());
            return response;
        } else {
            throw new RuntimeException("Invalid token!");
        }
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findAllDiplomasWithCompetitorsRequest")
    @ResponsePayload
    public FindAllDiplomasWithCompetitorsResponse findAllCompetitorsWithDiplomas(@RequestPayload FindAllDiplomasWithCompetitorsRequest request) {
        FindAllDiplomasWithCompetitorsResponse response = new FindAllDiplomasWithCompetitorsResponse();
        if (request.getToken().equalsIgnoreCase("secrettoken123")) {
            List<Diploma> diplomas = diplomaService.findAllDiplomasWithCompetitor();
            response.getDiplomaCompetitor().addAll(diplomas);
            return response;
        }
        throw new RuntimeException("Invalid token!");
    }
}
