package br.com.challenge.ciandt.playlist.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "PlaylistMusicas")
@IdClass(PlaylistMusica.PlaylistMusicaPK.class)
public class PlaylistMusica {

    @Id
    private String PlaylistId;
    @Id
    private String MusicaId;


    public class PlaylistMusicaPK implements Serializable {
        protected String PlaylistId;
        protected String MusicaId;

        public PlaylistMusicaPK() {}

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
}
