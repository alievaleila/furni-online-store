package az.edu.itbrains.furni_online_store.services.impl;

import az.edu.itbrains.furni_online_store.dtos.contact.ContactDashDto;
import az.edu.itbrains.furni_online_store.dtos.contact.ContactDto;
import az.edu.itbrains.furni_online_store.models.Contact;
import az.edu.itbrains.furni_online_store.repositories.ContactRepository;
import az.edu.itbrains.furni_online_store.services.ContactService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;
    private final ModelMapper modelMapper;

    @Override
    public void addContact(ContactDto contactDto) {
        Contact contact = new Contact();
        contact.setFirstName(contactDto.getFirstName());
        contact.setLastName(contactDto.getLastName());
        contact.setEmail(contactDto.getEmail());
        contact.setMessage(contactDto.getMessage());
        contactRepository.save(contact);
    }

    @Override
    public List<ContactDashDto> getAllContacts() {
        List<ContactDashDto> contactDashDtoList = contactRepository.findAll()
                .stream()
                .map(contact -> modelMapper.map(contact, ContactDashDto.class)).collect(Collectors.toList());
        return contactDashDtoList;
    }
}
