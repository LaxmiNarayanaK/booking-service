package com.PSTravelAggregator.models.traveller;


import javax.persistence.*;

@Entity
@Table(name = "SavedTraveller")
public class SavedTraveller {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="name", nullable = false)
    String name;

    @Column(name="DOB", nullable = false)
    String dateOfBirth;

    @Column(name="gender", nullable = false)
    String gender;

    @Column(name="user_id", nullable = false)
    String userID;

    @Column(name = "phone_number")
    String phoneNumber;

    @Column(name="email")
    String email;

    public SavedTraveller() {
    }

    public SavedTraveller(Integer id, String name, String dateOfBirth, String gender, String userID, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.userID = userID;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
