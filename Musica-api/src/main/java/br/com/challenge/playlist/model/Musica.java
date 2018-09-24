package br.com.challenge.playlist.model;

import org.hibernate.search.annotations.*;
import org.hibernate.search.annotations.Index;

import javax.persistence.*;

@Entity
@Table(name = "Musicas")
@Indexed
public class Musica {

    @Id
    @Column(name = "Id")
    private String id;

    @Column(name = "Nome")
    @Field(termVector = TermVector.YES, index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "ArtistaId")
    @IndexedEmbedded
    private Artista artista;

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

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
