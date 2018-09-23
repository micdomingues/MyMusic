package br.com.challenge.ciandt.playlist.controllers;

import br.com.challenge.ciandt.playlist.DTO.MusicasDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/playlists")
public class PlaylistController {

    @GetMapping()
    public ResponseEntity buscaPlaylistPorUsuario(@RequestParam(value = "user") String user) {
        return ResponseEntity.ok(user);
    }

    @PutMapping(value = "/{playlistId}/musicas")
    public ResponseEntity adicionarMusicaAPlaylist(@PathVariable(value = "playlistId") String playlistId,
                                                   @RequestBody MusicasDTO musica) {
        return ResponseEntity.ok(playlistId);
    }

    @DeleteMapping(value = "/{playlistId}/musicas/{musicaId}")
    public ResponseEntity removeMusicaDaPlaylist(@PathVariable(value = "playlistId") String playlistId,
                                                 @PathVariable(value = "musicaId") String musicaId) {
        return ResponseEntity.ok(playlistId);
    }
}
