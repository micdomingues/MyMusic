package br.com.challenge.playlist.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PlaylistMusicaPK implements Serializable {

    @Column(name = "PlaylistId")
    protected String PlaylistId;
    @Column(name = "MusicaId")
    protected String MusicaId;

    public PlaylistMusicaPK() {
    }

    public PlaylistMusicaPK(String playlistId, String musicaId) {
        PlaylistId = playlistId;
        MusicaId = musicaId;
    }

    public String getPlaylistId() {
        return PlaylistId;
    }

    public void setPlaylistId(String playlistId) {
        PlaylistId = playlistId;
    }

    public String getMusicaId() {
        return MusicaId;
    }

    public void setMusicaId(String musicaId) {
        MusicaId = musicaId;
    }
}