package ee.ttu.idu0075.cyclingresults.rest.competitor;

import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.Competitor;
import ee.ttu.idu0075.cyclingresults.dto.CompetitorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value = "api/competitor")
public class CompetitorController {

    @Resource
    private CompetitorService competitorService;

    @PostMapping
    @ApiOperation(value = "Add new competitor")
    public ResponseEntity<Competitor> save(@RequestBody Competitor competitor, @RequestParam("token") String token) {
        if (token.equalsIgnoreCase("secrettoken123")) {
            Competitor newCompetitor = new Competitor();
            newCompetitor.setId(Math.abs((long) new Random().nextInt(100)));
            newCompetitor.setPersonalCode(competitor.getPersonalCode());
            newCompetitor.setName(competitor.getName());
            System.out.println("siin on täisnim " + competitor.getName());
            System.out.println("siin on isikukood " + competitor.getPersonalCode());
            System.out.println("siin on id " + competitor.getId());
            return new ResponseEntity<>(competitorService.save(newCompetitor), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @GetMapping
    @ApiOperation(value = "Find all competitors")
    public ResponseEntity<List<Competitor>> findAll(@RequestParam("token") String token) {
        if (token.equalsIgnoreCase("secrettoken123")) {
            return new ResponseEntity<>(competitorService.findAll(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Find competitor by id")
    public ResponseEntity<Competitor> findById(@PathVariable("id") Long id, @RequestParam("token") String token) {
        if (token.equalsIgnoreCase("secrettoken123")) {
            return competitorService.findById(id)
                    .map(competitor -> new ResponseEntity<>(competitor, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }
}
