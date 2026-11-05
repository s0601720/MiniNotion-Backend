package de.htw_berlin.mininotion;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin(origins = "*")
public class PageController {

    private final PageRepository pageRepository;

    public PageController(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    // GET: Alle Notizen aus der PostgreSQL-Datenbank laden
    @GetMapping
    public List<Page> getAllPages() {
        return pageRepository.findAll();
    }

    // POST: Neue Notiz in der PostgreSQL-Datenbank speichern
    @PostMapping
    public Page createPage(@RequestBody Page page) {
        return pageRepository.save(page);
    }
}