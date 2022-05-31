package com.desafiogft.agenda.controller;

import com.desafiogft.agenda.model.Contact;
import com.desafiogft.agenda.service.ContactRepository;
import com.desafiogft.agenda.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ContactController {

@Autowired
ContactService contactService;

    @PostMapping(value = "/create")
    public ResponseEntity<Contact> save (@RequestBody Contact contact){
        contactService.save(contact);
        return ResponseEntity.ok(contact);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Contact> delete (@PathVariable Long id) throws Exception {
        contactService.deleteContact(id);
        return (ResponseEntity<Contact>) ResponseEntity.ok();
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Contact> updateContact (@PathVariable Long id, @RequestBody Contact contact) throws Exception {
        contactService.updateContact(id, contact);
        return ResponseEntity.ok(contact);
    }


}
