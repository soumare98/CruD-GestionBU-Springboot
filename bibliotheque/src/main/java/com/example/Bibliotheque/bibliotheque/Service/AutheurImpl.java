package com.example.Bibliotheque.bibliotheque.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Bibliotheque.bibliotheque.Entities.Autheur;
import com.example.Bibliotheque.bibliotheque.Repository.AutheurRepository;


@Service
public class AutheurImpl implements AutheurService {

    final private AutheurRepository autheurRepository;
    

    public AutheurImpl(AutheurRepository autheurRepository) {
        this.autheurRepository = autheurRepository;
    }

    @Override
    public void createAuteur(Autheur a) {
        this.autheurRepository.save(a);
        
    }

    @Override
    public List<Autheur> getAutheurs() {
        return this.autheurRepository.findAll();
      
    }

    @Override
    public Autheur getOnAutheur(Long id) {
        return this.autheurRepository.findById(id).get();
       
    }

    @Override
    public Autheur UpdateAutheur(Autheur a, Long id) {
        Autheur autheur = this.getOnAutheur(id);
        autheur.setName(a.getName());
      return  this.autheurRepository.save(autheur);
       
    }

    @Override
    public void DeleteAutheur(Long id) {
        this.autheurRepository.deleteById(id);
      
    }
    
}
