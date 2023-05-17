package com.nadeem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContactsMasterEntity {
	@Id
	@Column(name = "CONTACT_ID")
	private Integer contactId;
	
	@Column(name = "CONTACT_NAME")
	private String contactName;
	
	@Column(name = "CONTACT_NUMBER")
	private Long contactNumber;

	public Integer getContactId(int i) {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName(String string) {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getContactNumber(long i) {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public ContactsMasterEntity save(ContactsMasterEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
