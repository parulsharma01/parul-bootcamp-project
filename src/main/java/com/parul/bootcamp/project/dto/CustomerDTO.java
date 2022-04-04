package com.parul.bootcamp.project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.parul.bootcamp.project.entities.Role;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class CustomerDTO {

    @Email(message = "Email not valid")
    String email;
    @NotBlank(message = "Firstname is mandatory")
    String firstName;
    @NotBlank(message = "Lastname is mandatory")
    String lastName;
    String middleName;
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
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    Set<Role> roles = new HashSet<>();

    Date passwordUpdateDate;
    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",
            message = "Phone number not valid")
    String contactNumber;

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public CustomerDTO(String email, String firstName, String lastName, String middleName,
                       String password, String confirmPassword, Set<Role> roles,
                       Date passwordUpdateDate, String contactNumber) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.password = password;

        this.confirmPassword = confirmPassword;
        this.roles = roles;
        this.passwordUpdateDate = passwordUpdateDate;
        this.contactNumber=contactNumber;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Date getPasswordUpdateDate() {
        return passwordUpdateDate;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setPasswordUpdateDate(Date passwordUpdateDate) {
        this.passwordUpdateDate = passwordUpdateDate;
    }


}
