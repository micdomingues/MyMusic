package br.com.challenge.playlist.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PlaylistMusicas")
public class PlaylistMusica {

    @EmbeddedId
    private PlaylistMusicaPK playlistMusicaPK;

    public PlaylistMusicaPK getPlaylistMusicaPK() {
        return playlistMusicaPK;
    }

    public void setPlaylistMusicaPK(PlaylistMusicaPK playlistMusicaPK) {
        this.playlistMusicaPK = playlistMusicaPK;
    }

}
