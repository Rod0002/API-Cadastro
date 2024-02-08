package com.ca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ca.model.Artista;
import com.ca.service.ArtistaService;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {
    
    @Autowired
    private ArtistaService artistaService;
    
    @GetMapping
    public ResponseEntity<List<Artista>> listarArtistas() {
        List<Artista> artistas = (List<Artista>) artistaService.listarArtistas();
        return ResponseEntity.ok(artistas);
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Artista> buscarArtistaPorId(@PathVariable Long id) {
        Artista artista = artistaService.buscarArtistaPorId(id);
        if (artista != null) {
            return ResponseEntity.ok(artista);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping
    public ResponseEntity<Artista> salvarArtista(@RequestBody Artista artista) {
        Artista artistaSalvo = artistaService.salvarArtista(artista);
        return ResponseEntity.status(HttpStatus.CREATED).body(artistaSalvo);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirArtista(@PathVariable Long id) {
        artistaService.excluirArtista(id);
        return ResponseEntity.noContent().build();
    }
}
