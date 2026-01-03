package az.edu.itbrains.furni_online_store.services.impl;

import az.edu.itbrains.furni_online_store.dtos.contact.ContactDto;
import az.edu.itbrains.furni_online_store.models.Contact;
import az.edu.itbrains.furni_online_store.repositories.ContactRepository;
import az.edu.itbrains.furni_online_store.services.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    @Override
    public void addContact(ContactDto contactDto) {
        Contact contact = new Contact();
        contact.setFirstName(contactDto.getFirstName());
        contact.setLastName(contactDto.getLastName());
        contact.setEmail(contactDto.getEmail());
        contact.setMessage(contactDto.getMessage());
        contactRepository.save(contact);

    }
}
