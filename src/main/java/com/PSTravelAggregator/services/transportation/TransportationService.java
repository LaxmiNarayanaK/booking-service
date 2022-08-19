package com.PSTravelAggregator.services.transportation;

import com.PSTravelAggregator.models.transportation.TransportBookingDetails;

import java.util.Optional;

public interface TransportationService {
    TransportBookingDetails addBooking(TransportBookingDetails transportBookingDetails);

    Optional<TransportBookingDetails> getBooking(int bookingId);

    public Iterable<TransportBookingDetails> getBookingByUserId (String userId);

    TransportBookingDetails updateBooking(TransportBookingDetails transportBookingDetails);

    void deleteBooking(int bookingId);
}
