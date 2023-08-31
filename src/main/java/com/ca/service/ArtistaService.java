package com.ca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ca.model.Artista;
import com.ca.repository.ArtistaRepository;

@Service
public class ArtistaService {
    
    @Autowired
    private ArtistaRepository artistaRepository;
    
    public Iterable<Artista> listarArtistas() {
        return artistaRepository.findAll();
    }
    
    public Artista buscarArtistaPorId(Long id) {
        return artistaRepository.findById(id).orElse(null);
    }
    
    public Artista salvarArtista(Artista artista) {
        return artistaRepository.save(artista);
    }
    
    public void excluirArtista(Long id) {
        artistaRepository.deleteById(id);
    }}