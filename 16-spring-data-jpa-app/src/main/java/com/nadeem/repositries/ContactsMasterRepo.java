package com.nadeem.repositries;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.nadeem.entities.ContactsMasterEntity;

public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity, Serializable> {

}
