package za.ac.cput.service;

import za.ac.cput.domain.Contacts;

import java.util.List;

public interface IContactService extends IService<Contacts, String>{

    boolean delete (Contacts contactNumber);

    List<Contacts> getall();
}
