package com.PSTravelAggregator.models.accomodation;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "Traveller_Details_Accommodation")
public class TravellerDetailsAccommodation {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Column(name = "room_number", nullable = false)
    String roomNumber;

    @Column(name = "price", nullable = false)
    Double price;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "DOB", nullable = false)
    String dateOfBirth;

    @Column(name = "gender", nullable = false)
    String gender;

    @Column(name="phone_number")
    String phoneNumber;

    @Column(name = "email")
    String email;


    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "booking_id", referencedColumnName = "booking_id")
    AccommodationBookingDetails accommodationBookingDetails;

    public TravellerDetailsAccommodation() {
    }

    public TravellerDetailsAccommodation(Integer id, String roomNumber, Double price, String name, String dateOfBirth, String gender, String phoneNumber, String email, AccommodationBookingDetails accommodationBookingDetails) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.price = price;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.accommodationBookingDetails = accommodationBookingDetails;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public AccommodationBookingDetails getAccommodationBookingDetails() {
        return accommodationBookingDetails;
    }

    public void setAccommodationBookingDetails(AccommodationBookingDetails accommodationBookingDetails) {
        this.accommodationBookingDetails = accommodationBookingDetails;
    }
}
