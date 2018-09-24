package br.com.challenge.playlist.controllers;

import br.com.challenge.playlist.model.Musica;
import br.com.challenge.playlist.services.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/musicas")
@CrossOrigin(origins = "*")
public class MusicaController {

    private static int LIMITE_CARACTERES = 3;

    private MusicaService musicaService;

    @Autowired
    public MusicaController(MusicaService musicaService) {
        this.musicaService = musicaService;
    }

    @GetMapping()
    public ResponseEntity filtro(@RequestParam(value = "filtro", required = false) String filtro) {
        if (filtro == null || filtro.length() <= LIMITE_CARACTERES) {
            return ResponseEntity.badRequest().body("Número mínimo de caractéres não atingido");
        }
        List<Musica> musicas = musicaService.filtrarMusicas(filtro);
        if (musicas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(musicas);
    }
}