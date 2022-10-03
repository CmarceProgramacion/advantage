package com.shopping.models;

import java.util.List;

public class AccountModel {
    private String userName;
    private String email;
    private String password;
    private String firstsName;
    private String lastName;
    private String phoneNumber;
    private String country;
    private String city;
    private String address;
    private String state;
    private String postalCode;

    public AccountModel(List<String> listAccount) {
        this.userName = listAccount.get(0);
        this.email = listAccount.get(1);
        this.password = listAccount.get(2);
        this.firstsName = listAccount.get(3);
        this.lastName = listAccount.get(4);
        this.phoneNumber = listAccount.get(5);
        this.country = listAccount.get(6);
        this.city = listAccount.get(7);
        this.address = listAccount.get(8);
        this.state = listAccount.get(9);
        this.postalCode = listAccount.get(10);
    }

    public AccountModel(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstsName(String firstsName) {
        this.firstsName = firstsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstsName() {
        return firstsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
