package com.example.raghav.multilibrariesproject.models;

import java.util.HashMap;
import java.util.Map;

public class Citizen {

private Integer id;
private String name;
private String username;
private String email;
private Address address;
private String phone;
private String website;
private Company company;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public Citizen() {
}

/**
*
* @param id
* @param phone
* @param username
* @param website
* @param address
* @param email
* @param company
* @param name
*/
public Citizen(Integer id, String name, String username, String email, Address address, String phone, String website, Company company) {
this.id = id;
this.name = name;
this.username = username;
this.email = email;
this.address = address;
this.phone = phone;
this.website = website;
this.company = company;
}

/**
*
* @return
* The id
*/
public Integer getId() {
return id;
}

/**
*
* @param id
* The id
*/
public void setId(Integer id) {
this.id = id;
}

/**
*
* @return
* The name
*/
public String getName() {
return name;
}

/**
*
* @param name
* The name
*/
public void setName(String name) {
this.name = name;
}

/**
*
* @return
* The username
*/
public String getUsername() {
return username;
}

/**
*
* @param username
* The username
*/
public void setUsername(String username) {
this.username = username;
}

/**
*
* @return
* The email
*/
public String getEmail() {
return email;
}

/**
*
* @param email
* The email
*/
public void setEmail(String email) {
this.email = email;
}

/**
*
* @return
* The address
*/
public Address getAddress() {
return address;
}

/**
*
* @param address
* The address
*/
public void setAddress(Address address) {
this.address = address;
}

/**
*
* @return
* The phone
*/
public String getPhone() {
return phone;
}

/**
*
* @param phone
* The phone
*/
public void setPhone(String phone) {
this.phone = phone;
}

/**
*
* @return
* The website
*/
public String getWebsite() {
return website;
}

/**
*
* @param website
* The website
*/
public void setWebsite(String website) {
this.website = website;
}

/**
*
* @return
* The company
*/
public Company getCompany() {
return company;
}

/**
*
* @param company
* The company
*/
public void setCompany(Company company) {
this.company = company;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}