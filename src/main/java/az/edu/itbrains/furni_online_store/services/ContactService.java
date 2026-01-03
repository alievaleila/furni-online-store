package az.edu.itbrains.furni_online_store.services;

import az.edu.itbrains.furni_online_store.dtos.contact.ContactDashDto;
import az.edu.itbrains.furni_online_store.dtos.contact.ContactDto;

import java.util.List;

public interface ContactService {

    void addContact(ContactDto contactDto);

    List<ContactDashDto> getAllContacts();
}
