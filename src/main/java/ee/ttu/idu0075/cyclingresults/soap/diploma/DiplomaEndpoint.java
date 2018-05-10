package ee.ttu.idu0075.cyclingresults.soap.diploma;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.*;
import ee.ttu.idu0075.cyclingresults.dto.DiplomaService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Endpoint
public class DiplomaEndpoint {
    private static final String NAMESPACE_URI = "http://www.ttu.ee/idu0075/2018/ws/cyclingresults/wsdl";

    public DiplomaService diplomaService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addDiploma")
    @ResponsePayload
    public Diploma save(AddDiplomaRequest request) {
        Diploma diploma = new Diploma();
        if (request.getToken().equalsIgnoreCase("secrettoken123")) {
            diploma.setId(Math.abs(new Random().nextLong()));
            diploma.setEvent(request.getEvent());
            diploma.setAgeGroup(request.getAgeGroup());
            diploma.setPlacement(request.getPlacement());
            diploma.setTime(request.getTime());
            diploma.setTimeOfEvent(request.getTime());
            diplomaService.save(diploma);
            return diploma;
        }
        return null;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findDiplomaById")
    @ResponsePayload
    public Optional<FindDiplomaByIdResponse> findById(FindDiplomaByIdRequest request) {
        FindDiplomaByIdResponse response = new FindDiplomaByIdResponse();
        if (request.getToken().equalsIgnoreCase("secrettoken123")) {
            Optional<Diploma> diploma = diplomaService.findById(request.getId());
            response.setDiploma(diploma.get());
            return Optional.of(response);
        }
        return Optional.empty();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findAllDiplomas")
    @ResponsePayload
    public List<FindAllDiplomasResponse> findAll(FindAllDiplomasRequest request) {
        List<FindAllDiplomasResponse> response = new ArrayList<>();
        if (request.getToken().equalsIgnoreCase("secettoken123")) {
            List<Diploma> diplomas = diplomaService.findAll();
            diplomas.forEach(diploma -> {
                FindAllDiplomasResponse resp = new FindAllDiplomasResponse();
                resp.getDiploma().add(diploma);
                response.add(resp);
            });
            return response;
        }
        return null;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "setCompetitorToDiploma")
    @ResponsePayload
    public Optional<Diploma> setCompetitorToDiploma(SetCompetitorToDiplomaRequest request, Long diplomaId, Long competitorId) {
        if (request.getToken().equalsIgnoreCase("secrettoken123")) {
            return diplomaService.setCompetitorToDiploma(diplomaId, competitorId);
        } else {
            return Optional.empty();
        }
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findAllDiplomasWithCompetitors")
    @ResponsePayload
    public List<FindAllCompetitorsWithDiplomasResponse> findAllCompetitorsWithDiplomas(FindAllCompetitorsWithDiplomasRequest request) {
        List<FindAllCompetitorsWithDiplomasResponse> response = new ArrayList<>();
        if (request.getToken().equalsIgnoreCase("secrettoken123")) {
            List<Diploma> diplomas = diplomaService.findAllCompetitorsWithDiplomas();
            diplomas.forEach(diploma -> {
                FindAllCompetitorsWithDiplomasResponse resp = new FindAllCompetitorsWithDiplomasResponse();
                resp.getDiplomaCompetitor().add(diploma);
                response.add(resp);
            });
        }
        return response;
    }
}
