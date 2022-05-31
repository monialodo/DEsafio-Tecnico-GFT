package com.desafiogft.agenda.service;

import com.desafiogft.agenda.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactService {


    @Autowired
    ContactRepository contactRepository;

    public void save (Contact contact){

        contactRepository.save(contact);

    }

    public void deleteContact(Long id) throws Exception {
        contactRepository.findById(id);
        if(contactRepository == null) {
            throw new Exception("Contact not found");
        }
        contactRepository.deleteById(id);
    }

    public Contact updateContact (Long id,Contact contact) throws Exception {
        Optional<Contact> newContact = contactRepository.findById(id);
        if (newContact.isPresent()) {
            save(contact);
        }



    }



}
