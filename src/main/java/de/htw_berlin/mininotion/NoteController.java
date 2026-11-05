package de.htw_berlin.mininotion;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin(origins = "*") // Erlaubt den Zugriff von jeder Frontend-URL (oder spezifisch deine Frontend-URL eintragen)
public class NoteController {
    private final List<String> notes = new ArrayList<>(List.of("Erste Notiz", "Zweite Notiz"));

    @GetMapping
    public List<String> getNotes() {
        return List.of("Erste Notiz aus dem Backend", "Zweite Notiz aus dem Backend");
    }
}

