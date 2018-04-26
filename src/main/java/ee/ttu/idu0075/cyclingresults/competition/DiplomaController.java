package ee.ttu.idu0075.cyclingresults.competition;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "api/diploma")
public class DiplomaController {

    @Resource
    private DiplomaService diplomaService;

    @PostMapping
    @ApiOperation(value = "Add new diploma to the competitor")
    public ResponseEntity<Diploma> save(@RequestBody Diploma diploma) {
        return new ResponseEntity<>(diplomaService.save(diploma), HttpStatus.OK);
    }

    @GetMapping
    @ApiOperation(value = "Find all diplomas released")
    public ResponseEntity<List<Diploma>> findAll() {
        return new ResponseEntity<>(diplomaService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    @ApiOperation(value = "Find a diploma by it's id")
    public ResponseEntity<Diploma> findById(@PathVariable("id") Long id) {
        return diplomaService.findById(id)
                .map(diploma -> new ResponseEntity<>(diploma, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping(value = "/{diplomaId}/competitor/{competitorId}")
    @ApiOperation(value = "Set competitor to the diploma")
    public ResponseEntity<Diploma> setCompetitorToDiploma(@PathVariable("diplomaId") Long diplomaId,
                                                          @PathVariable("competitorId") Long competitorId) {
        return diplomaService.setCompetitorToDiploma(diplomaId, competitorId)
                .map(diploma -> new ResponseEntity<>(diploma, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping(value = "/competitorDiploma")
    @ApiOperation(value = "Get all competitors with diplomas")
    public ResponseEntity<List<Diploma>> findAllCompetitorsWithDiplomas() {
        return new ResponseEntity<>(diplomaService.findAllCompetitorsWithDiplomas(), HttpStatus.OK);
    }
}
