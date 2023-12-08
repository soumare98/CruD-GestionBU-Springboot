package com.example.Bibliotheque.bibliotheque.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Bibliotheque.bibliotheque.Entities.Autheur;

import jakarta.transaction.Transactional;

@Transactional
@Repository

public interface AutheurRepository extends JpaRepository<Autheur,Long> {

    
}
