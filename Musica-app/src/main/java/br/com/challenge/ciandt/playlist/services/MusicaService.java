package br.com.challenge.ciandt.playlist.services;

import br.com.challenge.ciandt.playlist.model.Musica;
import br.com.challenge.ciandt.playlist.repositories.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaService {

    private final MusicaRepository musicaRepository;

    @Autowired
    public MusicaService(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }

    public List<Musica> filtrarMusicas(String filtro) {
//        TODO: melhorar com fuzzy search
        return this.musicaRepository.findAll();
    }



}
