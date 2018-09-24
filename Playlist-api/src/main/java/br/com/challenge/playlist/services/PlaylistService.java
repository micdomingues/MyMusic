package br.com.challenge.playlist.services;

import br.com.challenge.playlist.DTO.MusicasDTO;
import br.com.challenge.playlist.model.Playlist;
import br.com.challenge.playlist.model.PlaylistMusica;
import br.com.challenge.playlist.model.PlaylistMusicaPK;
import br.com.challenge.playlist.repositories.PlaylistMusicaRepository;
import br.com.challenge.playlist.repositories.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlaylistService {

    private final PlaylistRepository playlistRepository;
    private final PlaylistMusicaRepository playlistMusicaRepository;

    @Autowired
    public PlaylistService(PlaylistRepository playlistRepository, PlaylistMusicaRepository playlistMusicaRepository) {
        this.playlistRepository = playlistRepository;
        this.playlistMusicaRepository = playlistMusicaRepository;
    }

    @Transactional
    public void adicionaMusicaAPlaylist(String playlistId, MusicasDTO musicasDTO) {
        Playlist playlist = playlistRepository.getOne(playlistId);
        if (playlist != null) {
            PlaylistMusicaPK playlistMusicaPK = new PlaylistMusicaPK(playlistId, musicasDTO.getId());
            PlaylistMusica PlaylistMusica = new PlaylistMusica();
            PlaylistMusica.setPlaylistMusicaPK(playlistMusicaPK);
            playlistMusicaRepository.save(PlaylistMusica);
        }
    }

    @Transactional
    public void removeMusicaDaPlaylist(String playlistId, String musicaId) {
        playlistMusicaRepository.deleteById(new PlaylistMusicaPK(playlistId, musicaId));
    }
}
