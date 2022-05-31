package com.desafiogft.agenda.service;

import com.desafiogft.agenda.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository  extends JpaRepository <Contact, Long> {
    
    
    
}
