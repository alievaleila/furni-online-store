package az.edu.itbrains.furni_online_store.controllers;

import az.edu.itbrains.furni_online_store.dtos.contact.ContactDashDto;
import az.edu.itbrains.furni_online_store.services.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ContactDashController {

    private final ContactService contactService;

    @GetMapping("/admin/contact")
    public String dashContact(Model model) {
        List<ContactDashDto> contactDashDtoList = contactService.getAllContacts();
        model.addAttribute("contacts", contactDashDtoList);
        return "/dashboard/contact/index.html";
    }

    @GetMapping("/admin/contact/create")
    public String create() {
        return "/dashboard/admin/create.html";
    }
}
