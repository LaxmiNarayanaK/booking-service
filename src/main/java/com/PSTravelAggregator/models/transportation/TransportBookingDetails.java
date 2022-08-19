package com.PSTravelAggregator.models.transportation;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Transport_Booking_Details")
public class TransportBookingDetails {

    @Id
    @Column(name = "booking_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int bookingId;

    @Column(name = "user_id", nullable = false)
    String userID;

    @Column(name = "transportation_type", nullable = false)
    String transportationType;

    @Column(name = "booking_date", nullable = false)
    String bookingDate;

    @Column(name = "travel_date", nullable = false)
    String travelDate;

    @Column(name = "no_of_travellers", nullable = false)
    int noOfTravellers;

    @Column(name = "total_price", nullable = false)
    float totalPrice;

    @Column(name = "package_name", nullable = false)
    String packageName;

    @Column(name = "booking_status", nullable = false)
    String bookingStatus;

    @Column(name = "transportation_id", nullable = false)
    String transportationId;

    @Column(name = "transaction_id", nullable = false)
    String transactionId;

    @JsonManagedReference
    @OneToMany(mappedBy = "transportBookingDetails", cascade = CascadeType.ALL)
    List<TravellerDetailsTransport> travellerDetailsTransportList;


    public TransportBookingDetails() {
    }

    public TransportBookingDetails(int bookingId, String userID, String transportationType, String bookingDate, String travelDate, int noOfTravellers, float totalPrice, String packageName, String bookingStatus, String transportationId, String transactionId, List<TravellerDetailsTransport> travellerDetailsTransportList) {
        this.bookingId = bookingId;
        this.userID = userID;
        this.transportationType = transportationType;
        this.bookingDate = bookingDate;
        this.travelDate = travelDate;
        this.noOfTravellers = noOfTravellers;
        this.totalPrice = totalPrice;
        this.packageName = packageName;
        this.bookingStatus = bookingStatus;
        this.transportationId = transportationId;
        this.transactionId = transactionId;
        this.travellerDetailsTransportList = travellerDetailsTransportList;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(String transportationType) {
        this.transportationType = transportationType;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public int getNoOfTravellers() {
        return noOfTravellers;
    }

    public void setNoOfTravellers(int noOfTravellers) {
        this.noOfTravellers = noOfTravellers;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getTransportationId() {
        return transportationId;
    }

    public void setTransportationId(String transportationId) {
        this.transportationId = transportationId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public List<TravellerDetailsTransport> getTravellerDetailsTransportList() {
        return travellerDetailsTransportList;
    }

    public void setTravellerDetailsTransportList(List<TravellerDetailsTransport> travellerDetailsTransportList) {
        this.travellerDetailsTransportList = travellerDetailsTransportList;
    }
}
