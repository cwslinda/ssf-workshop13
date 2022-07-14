package vttp2022.ssf.ssfworkshop13.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vttp2022.ssf.ssfworkshop13.models.Contact;

@Controller
@RequestMapping(path = "/addressbook")
public class AddressbookController {
    @GetMapping
    public String showAddressBookForm(Model model){
        model.addAttribute("contact", new Contact());
        return "addressbook";
    }

    
}
