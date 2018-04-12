package ee.ttu.idu0075.cyclingresults.competitor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "api/competitor")
public class CompetitorController {

    @Resource
    private CompetitorService competitorService;

    @PostMapping
    public ResponseEntity<Competitor> save(@RequestBody Competitor competitor) {
        return new ResponseEntity<>(competitorService.save(competitor), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Competitor>> findAll() {
        return new ResponseEntity<>(competitorService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/:id")
    public ResponseEntity<Competitor> findById(@PathVariable Long id) {
        return competitorService.findById(id)
                .map(competitor -> new ResponseEntity<>(competitor, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
