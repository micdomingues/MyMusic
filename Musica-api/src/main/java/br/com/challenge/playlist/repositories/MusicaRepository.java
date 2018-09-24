package br.com.challenge.playlist.repositories;

import br.com.challenge.playlist.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, String> {

}
