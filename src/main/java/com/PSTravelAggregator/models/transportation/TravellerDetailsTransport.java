package com.PSTravelAggregator.models.transportation;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Traveller_Details_Transport")
public class TravellerDetailsTransport {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;


    @Column(name = "seat_numbers", nullable = false)
    String seatNumbers;

    @Column(name = "base_price", nullable = false)
    float basePrice;

    @Column(name = "meal_price", nullable = false)
    float mealPrice;

    @Column(name = "luggage_price", nullable = false)
    float luggagePrice;

    @Column(name = "seat_price", nullable = false)
    float seatPrice;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "date_of_birth", nullable = false)
    String dateOfBirth;

    @Column(name = "phone_no")
    String phoneNumber;

    @Column(name = "email")
    String email;

    @Column(name = "gender", nullable = false)
    String gender;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "booking_id", referencedColumnName = "booking_id")
    TransportBookingDetails transportBookingDetails;

    public TravellerDetailsTransport() {
    }

    public TravellerDetailsTransport(int id, String seatNumbers, float basePrice, float mealPrice, float luggagePrice, float seatPrice, String name, String dateOfBirth, String phoneNumber, String email, String gender, TransportBookingDetails transportBookingDetails) {
        this.id = id;
        this.seatNumbers = seatNumbers;
        this.basePrice = basePrice;
        this.mealPrice = mealPrice;
        this.luggagePrice = luggagePrice;
        this.seatPrice = seatPrice;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.transportBookingDetails = transportBookingDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeatNumbers() {
        return seatNumbers;
    }

    public void setSeatNumbers(String seatNumbers) {
        this.seatNumbers = seatNumbers;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public float getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(float mealPrice) {
        this.mealPrice = mealPrice;
    }

    public float getLuggagePrice() {
        return luggagePrice;
    }

    public void setLuggagePrice(float luggagePrice) {
        this.luggagePrice = luggagePrice;
    }

    public float getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(float seatPrice) {
        this.seatPrice = seatPrice;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public TransportBookingDetails getTransportBookingDetails() {
        return transportBookingDetails;
    }

    public void setTransportBookingDetails(TransportBookingDetails transportBookingDetails) {
        this.transportBookingDetails = transportBookingDetails;
    }
}
