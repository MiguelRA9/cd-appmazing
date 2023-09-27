package com.campusdual.appmazing.service;

import com.campusdual.appmazing.api.IContactService;
import com.campusdual.appmazing.model.Contact;
import com.campusdual.appmazing.model.Product;
import com.campusdual.appmazing.model.dao.ContactDao;
import com.campusdual.appmazing.model.dto.ContactDto;
import com.campusdual.appmazing.model.dto.dtomapper.ContactMapper;
import com.campusdual.appmazing.model.dto.dtomapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ContactService")
@Lazy
public class ContactService implements IContactService {

    @Autowired
    private ContactDao contactDao;

    @Override
    public ContactDto queryContact(ContactDto contactDto) {
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDto);
        Contact contactFinal = this.contactDao.getReferenceById(contact.getId());
        return ContactMapper.INSTANCE.toDTO(contactFinal);
    }

    @Override
    public List<ContactDto> queryAllContacts() {
        return ContactMapper.INSTANCE.toDTOList(this.contactDao.findAll());
    }

    @Override
    public int insertContact(ContactDto contactDto) {
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDto);
        this.contactDao.saveAndFlush(contact);
        return contact.getId();
    }

    @Override
    public int updateContact(ContactDto contactDto) {
        return this.insertContact(contactDto);
    }

    @Override
    public int deleteContact(ContactDto contactDto) {
        int id = contactDto.getId();
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDto);
        this.contactDao.delete(contact);
        return id;
    }
}
