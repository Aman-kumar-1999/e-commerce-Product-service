package com.eqipped.productService.entities;

//import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Optional;

@Getter
@Setter
@Document
public class User {

    @Id
    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String enabled;
    private String profile;
    private String registerAs;
    private String institutionName;
    private String pincode;
    private String city;
    private String state;
    private String country;
    private String isuploded;
    private String isverified;
    private String isemailverified;
    private String documentNumber;
    private String address;
    private String avatar;
    private String document;
    private String roleId;
    private String rolePermissionId;
    private String imageName;
    private String imagePath;

    public User() {

    }

    public User(String id, String username, String password, String firstName, String lastName, String email, String phone, String enabled, String profile, String registerAs, String institutionName, String pincode, String city, String state, String country, String isuploded, String isverified, String isemailverified, String documentNumber, String address, String avatar, String document, String roleId, String rolePermissionId, String imageName, String imagePath) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.enabled = enabled;
        this.profile = profile;
        this.registerAs = registerAs;
        this.institutionName = institutionName;
        this.pincode = pincode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.isuploded = isuploded;
        this.isverified = isverified;
        this.isemailverified = isemailverified;
        this.documentNumber = documentNumber;
        this.address = address;
        this.avatar = avatar;
        this.document = document;
        this.roleId = roleId;
        this.rolePermissionId = rolePermissionId;
        this.imageName = imageName;
        this.imagePath = imagePath;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String isEnabled() {
        return enabled;
    }

    public String getProfile() {
        return profile;
    }

    public String getRegisterAs() {
        return registerAs;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public String getPincode() {
        return pincode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getRoleId() {
        return roleId;
    }

    public String getIsuploded() {
        return isuploded;
    }

    public String getIsverified() {
        return isverified;
    }

    public String getIsemailverified() {
        return isemailverified;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getDocument() {
        return document;
    }

    public void setId(String id) {
        this.id = id;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setRegisterAs(String registerAs) {
        this.registerAs = registerAs;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public void setIsuploded(String isuploded) {
        this.isuploded = isuploded;
    }

    public void setIsverified(String isverified) {
        this.isverified = isverified;
    }

    public void setIsemailverified(String isemailverified) {
        this.isemailverified = isemailverified;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEnabled() {
        return enabled;
    }

    public String getRolePermissionId() {
        return rolePermissionId;
    }

    public void setRolePermissionId(String rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    }

