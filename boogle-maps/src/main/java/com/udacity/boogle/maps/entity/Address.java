package com.udacity.boogle.maps.entity;

/**
 * Declares a class to store an address, city, state and zip code.
 */
public class Address {

    private String address;
    private String city;
    private String state;
    private String zio;

    public Address(String address, String city, String state, String zio) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zio = zio;
    }

    public Address() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZio() {
        return zio;
    }

    public void setZio(String zio) {
        this.zio = zio;
    }
}
