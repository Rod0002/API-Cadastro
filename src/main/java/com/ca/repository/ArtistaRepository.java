package com.ca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ca.model.Artista;

@Repository
public interface ArtistaRepository extends CrudRepository<Artista, Long> {

}
