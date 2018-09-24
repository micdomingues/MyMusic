package br.com.challenge.playlist.services;

import br.com.challenge.playlist.model.Playlist;
import br.com.challenge.playlist.model.Usuario;
import br.com.challenge.playlist.repositories.PlaylistMusicaRepository;
import br.com.challenge.playlist.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PlaylistMusicaRepository playlistMusicaRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository,
                          PlaylistMusicaRepository playlistMusicaRepository) {
        this.usuarioRepository = usuarioRepository;
        this.playlistMusicaRepository = playlistMusicaRepository;
    }

    public Playlist findPlayListByNome(String nome) {
        Usuario usuario = usuarioRepository.findByNome(nome);
        if (usuario != null) {
//            findMusicas
        }
        return null;
    }
}
