package com.PSTravelAggregator.services.implementations.accomodation;

import com.PSTravelAggregator.models.accomodation.AccommodationBookingDetails;
import com.PSTravelAggregator.repositories.accomodation.AccommodationBookingRepository;
import com.PSTravelAggregator.services.accomodation.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccommodationServiceImpl implements AccommodationService{

    @Autowired
    AccommodationBookingRepository accommodationBookingRepository;

    @Override
    public AccommodationBookingDetails bookAccommodation(AccommodationBookingDetails accommodationBookingDetails) {
        return accommodationBookingRepository.save(accommodationBookingDetails);
    }

    @Override
    public List<AccommodationBookingDetails> getAccommodationByUserID(String userID) {
        return accommodationBookingRepository.findByUserID(userID);
    }

    @Override
    public Optional<AccommodationBookingDetails> getAccommodationByID(Integer bookingID) {
        return accommodationBookingRepository.findById(bookingID);
    }
}
