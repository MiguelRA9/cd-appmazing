package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.ContactDto;

import java.util.List;

public interface IContactService {
    //CRUD Operations
    ContactDto queryProduct(ContactDto product);
    List<ContactDto> queryAllProducts();
    int insertProduct(ContactDto product);
    int updateProduct(ContactDto product);
    int deleteProduct(ContactDto product);
}
