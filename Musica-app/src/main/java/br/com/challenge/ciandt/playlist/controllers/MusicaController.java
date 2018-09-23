package br.com.challenge.ciandt.playlist.controllers;

import br.com.challenge.ciandt.playlist.model.Musica;
import br.com.challenge.ciandt.playlist.services.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/musicas")
public class MusicaController {

    private static int LIMITE_CARACTERES = 3;

    private MusicaService musicaService;

    @Autowired
    public MusicaController(MusicaService musicaService) {
        this.musicaService = musicaService;
    }

    @GetMapping()
    public ResponseEntity filtro(@RequestParam(value = "filtro", required = false) String filtro) {
        if (filtro.length() <= LIMITE_CARACTERES) {
            return ResponseEntity.badRequest().body("Número mínimo de caractéres não atingido");
        }
        List<Musica> musicas = musicaService.filtrarMusicas(filtro);
        if (musicas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(musicaService.filtrarMusicas(filtro));
    }
}