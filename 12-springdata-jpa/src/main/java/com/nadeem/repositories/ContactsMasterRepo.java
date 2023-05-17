package com.nadeem.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.nadeem.ContactsMasterEntity;

public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity, Serializable>{

}
