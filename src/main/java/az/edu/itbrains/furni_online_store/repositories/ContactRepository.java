package az.edu.itbrains.furni_online_store.repositories;

import az.edu.itbrains.furni_online_store.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {

}
