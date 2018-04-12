package ee.ttu.idu0075.cyclingresults.competition;

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
    public ResponseEntity<Diploma> save(@RequestBody Diploma diploma) {
        return new ResponseEntity<>(diplomaService.save(diploma), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Diploma>> findAll() {
        return new ResponseEntity<>(diplomaService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/:id")
    public ResponseEntity<Diploma> findById(@PathVariable Long id) {
        return diplomaService.findById(id)
                .map(diploma -> new ResponseEntity<>(diploma, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
