package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.ContactDto;

import java.util.List;

public interface IContactService {
    //CRUD Operations
    ContactDto queryContact(ContactDto contact);
    List<ContactDto> queryAllContacts();
    int insertContact(ContactDto contact);
    int updateContact(ContactDto contact);
    int deleteContact(ContactDto contact);
}
