package com.julianjupiter.addressbook.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import java.time.OffsetDateTime;

@Entity
public class Contact {
   // @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
    @SequenceGenerator(name="book_generator", sequenceName = "book_seq", allocationSize=50)

    
    
    private Integer  id;
    private String firstName;
    private String middleName;
    
    private String lastName;
    private String address;
    private String mobileNumber;
    private String emailAddress;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    public Integer getId() {
        return id;
    }

    public Contact setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Contact setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    

    public String getMiddleName() {
		return middleName;
	}

	public Contact setMiddleName(String middleName) {
		this.middleName = middleName;
		return this;
	}

	public String getLastName() {
        return lastName;
    }

    public Contact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Contact setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Contact setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Contact setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public Contact setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Contact setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
