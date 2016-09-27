package com.example.raghav.multilibrariesproject.models;

import java.util.HashMap;
import java.util.Map;

public class Geo {

private String lat;
private String lng;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public Geo() {
}

/**
*
* @param lng
* @param lat
*/
public Geo(String lat, String lng) {
this.lat = lat;
this.lng = lng;
}

/**
*
* @return
* The lat
*/
public String getLat() {
return lat;
}

/**
*
* @param lat
* The lat
*/
public void setLat(String lat) {
this.lat = lat;
}

/**
*
* @return
* The lng
*/
public String getLng() {
return lng;
}

/**
*
* @param lng
* The lng
*/
public void setLng(String lng) {
this.lng = lng;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}