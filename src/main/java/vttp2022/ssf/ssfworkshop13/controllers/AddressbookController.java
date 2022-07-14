package vttp2022.ssf.ssfworkshop13.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vttp2022.ssf.ssfworkshop13.models.Contact;
import vttp2022.ssf.ssfworkshop13.util.Contacts;



@Controller
@RequestMapping(path = "/addressbook")
public class AddressbookController {

    @Autowired
    Contacts ctcz;

    @Autowired
    ApplicationArguments appArgs;

    @GetMapping
    public String showAddressBookForm(Model model){
        model.addAttribute("contact", new Contact());
        return "addressbook";
    }

    @PostMapping
    public String saveContact(@ModelAttribute Contact contact, Model model){
        ctcz.saveContact(contact, model, appArgs);
        return "showContact";
    }

    @GetMapping("{contactId}")
    public  String getContactById(Model model, @PathVariable String contactId){
        ctcz.getContactById(model, contactId, appArgs);
        return "showContact";
    }
}
