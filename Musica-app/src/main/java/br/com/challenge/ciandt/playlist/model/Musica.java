package br.com.challenge.ciandt.playlist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Musica")
public class Musica {

    @Id
    @Column(name = "Id")
    private String id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "ArtistaId")
    private String artista;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
