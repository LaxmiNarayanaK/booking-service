package com.PSTravelAggregator.models.accomodation;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.id.IntegralDataTypeHolder;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
@Table(name = "Accommodation_Booking_Details")
public class AccommodationBookingDetails {

    @Id
    @Column(name = "booking_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer bookingID;

    @Column(name="user_id", nullable = false)
    String userID;

    @Column(name = "booking_date", nullable = false)
    String bookingDate;

    @Column(name="accommodation_type", nullable = false)
    String accommodationType;

    @Column(name = "accommodation_id", nullable = false)
    String accommodationID;

    @Column(name = "number_of_travellers", nullable = false)
    String numberOfTravellers;

    @Column(name="total_price", nullable = false)
    Double totalPrice;

    @Column(name = "transaction_id", nullable = false)
    String transactionID;

    @Column(name="number_of_rooms", nullable = false)
    Integer numberOfRooms;

    @Column(name="check_in_date", nullable = false)
    String checkIndDate;

    @Column(name = "check_out_date", nullable = false)
    String checkOutDate;

    @Column(name = "booking_status", nullable = false)
    String bookingStatus;

    @JsonManagedReference
    @OneToMany(mappedBy = "accommodationBookingDetails", cascade = CascadeType.ALL)
    List<TravellerDetailsAccommodation> travellerDetailsAccommodationList;

    public AccommodationBookingDetails() {
    }

    public AccommodationBookingDetails(Integer bookingID, String userID, String bookingDate, String accommodationType, String accommodationID, String numberOfTravellers, Double totalPrice, String transactionID, Integer numberOfRooms, String checkIndDate, String checkOutDate, String bookingStatus, List<TravellerDetailsAccommodation> travellerDetailsAccommodationList) {
        this.bookingID = bookingID;
        this.userID = userID;
        this.bookingDate = bookingDate;
        this.accommodationType = accommodationType;
        this.accommodationID = accommodationID;
        this.numberOfTravellers = numberOfTravellers;
        this.totalPrice = totalPrice;
        this.transactionID = transactionID;
        this.numberOfRooms = numberOfRooms;
        this.checkIndDate = checkIndDate;
        this.checkOutDate = checkOutDate;
        this.bookingStatus = bookingStatus;
        this.travellerDetailsAccommodationList = travellerDetailsAccommodationList;
    }

    public Integer getBookingID() {
        return bookingID;
    }

    public void setBookingID(Integer bookingID) {
        this.bookingID = bookingID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(String accommodationType) {
        this.accommodationType = accommodationType;
    }

    public String getAccommodationID() {
        return accommodationID;
    }

    public void setAccommodationID(String accommodationID) {
        this.accommodationID = accommodationID;
    }

    public String getNumberOfTravellers() {
        return numberOfTravellers;
    }

    public void setNumberOfTravellers(String numberOfTravellers) {
        this.numberOfTravellers = numberOfTravellers;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getCheckIndDate() {
        return checkIndDate;
    }

    public void setCheckIndDate(String checkIndDate) {
        this.checkIndDate = checkIndDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public List<TravellerDetailsAccommodation> getTravellerDetailsAccommodationList() {
        return travellerDetailsAccommodationList;
    }

    public void setTravellerDetailsAccommodationList(List<TravellerDetailsAccommodation> travellerDetailsAccommodationList) {
        this.travellerDetailsAccommodationList = travellerDetailsAccommodationList;
    }

}
