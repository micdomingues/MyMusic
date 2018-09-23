package br.com.challenge.ciandt.playlist.repositories;

import br.com.challenge.ciandt.playlist.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepository extends JpaRepository<Musica, String> {

}
