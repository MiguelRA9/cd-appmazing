package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.IContactService;
import com.campusdual.appmazing.model.dto.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private IContactService contactService;

    @GetMapping
    public String testController(){
        return "Contact controller works!";
    }

    @PostMapping
    public String testController(@RequestBody String name){
        return "Contact controller works, "+ name +"!";
    }

    @GetMapping(value = "/testMethod")
    public String testControllerMethod(){
        return "Contact controller method works!";
    }

    @PostMapping(value = "/get")
    public ContactDto queryContact(@RequestBody ContactDto contact){
        return this.contactService.queryContact(contact);
    }

    @GetMapping(value = "/getAll")
    public List<ContactDto> queryAllContacts(){return this.contactService.queryAllContacts();}

    @PostMapping(value = "/add")
    public int insertContact(@RequestBody ContactDto contactDto){return this.contactService.insertContact(contactDto);}

    @PutMapping(value = "/update")
    public int updateContact(@RequestBody ContactDto contactDto){return this.contactService.updateContact(contactDto);}

    @DeleteMapping(value = "/delete")
    public int deleteContact(@RequestBody ContactDto contactDto){return this.contactService.deleteContact(contactDto);}

}
