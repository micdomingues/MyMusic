package br.com.challenge.playlist.controllers;

import br.com.challenge.playlist.DTO.MusicasDTO;
import br.com.challenge.playlist.model.Playlist;
import br.com.challenge.playlist.services.PlaylistService;
import br.com.challenge.playlist.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/playlists")
public class PlaylistController {

    private final UsuarioService usuarioService;
    private final PlaylistService playlistService;

    @Autowired
    public PlaylistController(UsuarioService usuarioService, PlaylistService playlistService) {
        this.usuarioService = usuarioService;
        this.playlistService = playlistService;
    }

    @GetMapping()
    public ResponseEntity<Playlist> buscaPlaylistPorUsuario(@RequestParam(value = "user") String userName) {
        return ResponseEntity.ok(usuarioService.findPlayListByNome(userName));
    }

    @PutMapping(value = "/{playlistId}/musicas")
    public ResponseEntity adicionarMusicaAPlaylist(@PathVariable(value = "playlistId") String playlistId,
                                                   @RequestBody MusicasDTO musica) {
        playlistService.adicionaMusicaAPlaylist(playlistId, musica);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/{playlistId}/musicas/{musicaId}")
    public ResponseEntity removeMusicaDaPlaylist(@PathVariable(value = "playlistId") String playlistId,
                                                 @PathVariable(value = "musicaId") String musicaId) {
        playlistService.removeMusicaDaPlaylist(playlistId, musicaId);
        return ResponseEntity.ok().build();
    }
}
