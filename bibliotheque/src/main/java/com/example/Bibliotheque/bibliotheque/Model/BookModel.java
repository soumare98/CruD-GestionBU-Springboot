package com.example.Bibliotheque.bibliotheque.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookModel {

    private String title;
    private int isbn;  
    private Long autheur_id;    
    
}
