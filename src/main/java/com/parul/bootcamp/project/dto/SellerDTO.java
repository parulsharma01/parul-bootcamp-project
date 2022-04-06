package com.parul.bootcamp.project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.parul.bootcamp.project.entities.Role;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SellerDTO {
//Email should be unique
//    Email should be valid
//    Phone number should be valid
//    Password should be valid
//    GST should be unique
//    GST should be valid as per Govt. norms
//    Company Name should be unique (Case insensitive)


    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email not valid")
    String email;
    @NotBlank(message = "Firstname is mandatory")
    String firstName;
    @NotBlank(message = "Lastname is mandatory")
    String lastName;
    @Pattern(regexp = "^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%*!^&+=])"
            + "(?=\\S+$).{8,16}$",
            message = "Password should contain atleast 1 uppercase, 1 lowercase, 1 numeric value" +
                    " and 1 special character")
    @NotBlank(message = "Password field is mandatory")
    String password;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    String confirmPassword;

    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",
            message = "Phone number not valid")
    String companyContact;

    @Pattern(regexp = "^[0-9]{2}[A-Z]{5}[0-9]{4}"
            + "[A-Z]{1}[1-9A-Z]{1}"
            + "Z[0-9A-Z]{1}$",
            message = "GST is not valid as per Govt. norms")
    @NotBlank(message = "GST field is mandatory")
    String gst;
    //valid gst number : 06BZAHM6385P6Z2

    @NotBlank(message = "Company Name field is mandatory")
    String companyName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
