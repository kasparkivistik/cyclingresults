package ee.ttu.idu0075.cyclingresults.rest.diploma;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Diploma;
import ee.ttu.idu0075.cyclingresults.dto.DiplomaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value = "api/diploma")
public class DiplomaController {

    @Resource
    private DiplomaService diplomaService;

    @PostMapping
    @ApiOperation(value = "Add new diploma")
    public ResponseEntity<Diploma> save(@RequestBody Diploma diploma, @RequestParam("token") String token) {
        if (token.equalsIgnoreCase("secrettoken123")) {
            diploma.setId(Math.abs(((long) new Random().nextInt(100))));
            return new ResponseEntity<>(diplomaService.save(diploma), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @GetMapping
    @ApiOperation(value = "Find all diplomas released")
    public ResponseEntity<List<Diploma>> findAll(@RequestParam("token") String token) {
        if (token.equalsIgnoreCase("secredtoken123")) {
            return new ResponseEntity<>(diplomaService.findAll(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @GetMapping(value = "{id}")
    @ApiOperation(value = "Find a diploma by it's id")
    public ResponseEntity<Diploma> findById(@PathVariable("id") Long id, @RequestParam String token) {
        if (token.equalsIgnoreCase("secrettoken123")) {
            return diplomaService.findById(id)
                    .map(diploma -> new ResponseEntity<>(diploma, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @PutMapping(value = "/{diplomaId}/competitor/{competitorId}")
    @ApiOperation(value = "Set competitor to the diploma")
    public ResponseEntity<Diploma> setCompetitorToDiploma(@PathVariable("diplomaId") Long diplomaId,
                                                          @PathVariable("competitorId") Long competitorId,
                                                          @RequestParam("token") String token) {
        if (token.equalsIgnoreCase("secrettoken123")) {
            return diplomaService.setCompetitorToDiploma(diplomaId, competitorId)
                    .map(diploma -> new ResponseEntity<>(diploma, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @GetMapping(value = "/competitorDiploma")
    @ApiOperation(value = "Get all competitors with diplomas")
    public ResponseEntity<List<Diploma>> findAllCompetitorsWithDiplomas(@RequestParam("token") String token) {
        if (token.equalsIgnoreCase("secrettoken123")) {
            return new ResponseEntity<>(diplomaService.findAllDiplomasWithCompetitor(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }
}
