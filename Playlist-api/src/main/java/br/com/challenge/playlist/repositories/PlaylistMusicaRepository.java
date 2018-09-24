package br.com.challenge.playlist.repositories;

import br.com.challenge.playlist.model.PlaylistMusica;
import br.com.challenge.playlist.model.PlaylistMusicaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistMusicaRepository extends JpaRepository<PlaylistMusica, PlaylistMusicaPK> {

}
