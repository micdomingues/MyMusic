package br.com.challenge.playlist.model;

import javax.persistence.*;

@Entity
@Table(name = "Playlists")
public class Playlist {

    @Id
    @Column(name = "Id")
    private String id;

    @OneToOne(mappedBy = "playlist", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Usuario usuario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
