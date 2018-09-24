package br.com.challenge.playlist.repositories;

import br.com.challenge.playlist.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    Usuario findByNome(String nome);
}
