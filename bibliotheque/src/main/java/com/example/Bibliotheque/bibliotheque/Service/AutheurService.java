package com.example.Bibliotheque.bibliotheque.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Bibliotheque.bibliotheque.Entities.Autheur;

@Service

public interface AutheurService {

    void createAuteur(Autheur a);
    List<Autheur> getAutheurs();
    Autheur getOnAutheur(Long id);
    Autheur UpdateAutheur(Autheur a, Long id);
    void DeleteAutheur(Long id);
    
    
}
