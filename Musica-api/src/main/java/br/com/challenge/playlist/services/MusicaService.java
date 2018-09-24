package br.com.challenge.playlist.services;

import br.com.challenge.playlist.model.Musica;
import br.com.challenge.playlist.repositories.MusicaRepository;
import org.apache.lucene.search.Query;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.FullTextQuery;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class MusicaService {

    private final MusicaRepository musicaRepository;

    @Autowired
    EntityManager entityManager;

    @Autowired
    public MusicaService(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }

    @Transactional(readOnly = true)
    public List<Musica> filtrarMusicas(String filtro) {

        FullTextEntityManager fullTextEntityManager
                = Search.getFullTextEntityManager(entityManager);

        QueryBuilder queryBuilder = fullTextEntityManager.getSearchFactory()
                .buildQueryBuilder()
                .forEntity(Musica.class)
                .get();

        Query query = queryBuilder
                .keyword()
                .onFields("nome", "artista.nome")
                .matching(filtro)
                .createQuery();

        FullTextQuery jpaQuery
                = fullTextEntityManager.createFullTextQuery(query, Musica.class);

        //        TODO: melhorar com fuzzy search
        return jpaQuery.getResultList();
    }



}
