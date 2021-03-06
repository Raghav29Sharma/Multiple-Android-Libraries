package com.example.raghav.multilibrariesproject.models;

import java.util.HashMap;
import java.util.Map;

public class Address {

private String street;
private String suite;
private String city;
private String zipcode;
private Geo geo;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public Address() {
}

/**
*
* @param geo
* @param zipcode
* @param street
* @param suite
* @param city
*/
public Address(String street, String suite, String city, String zipcode, Geo geo) {
this.street = street;
this.suite = suite;
this.city = city;
this.zipcode = zipcode;
this.geo = geo;
}

/**
*
* @return
* The street
*/
public String getStreet() {
return street;
}

/**
*
* @param street
* The street
*/
public void setStreet(String street) {
this.street = street;
}

/**
*
* @return
* The suite
*/
public String getSuite() {
return suite;
}

/**
*
* @param suite
* The suite
*/
public void setSuite(String suite) {
this.suite = suite;
}

/**
*
* @return
* The city
*/
public String getCity() {
return city;
}

/**
*
* @param city
* The city
*/
public void setCity(String city) {
this.city = city;
}

/**
*
* @return
* The zipcode
*/
public String getZipcode() {
return zipcode;
}

/**
*
* @param zipcode
* The zipcode
*/
public void setZipcode(String zipcode) {
this.zipcode = zipcode;
}

/**
*
* @return
* The geo
*/
public Geo getGeo() {
return geo;
}

/**
*
* @param geo
* The geo
*/
public void setGeo(Geo geo) {
this.geo = geo;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}