package com.PSTravelAggregator.services.accomodation;

import com.PSTravelAggregator.models.accomodation.AccommodationBookingDetails;

import java.util.List;
import java.util.Optional;

public interface AccommodationService {

    public AccommodationBookingDetails bookAccommodation(AccommodationBookingDetails accommodationBookingDetails);

    public List<AccommodationBookingDetails> getAccommodationByUserID(String userID);

    public Optional<AccommodationBookingDetails> getAccommodationByID(Integer bookingID);
}
