package com.PSTravelAggregator.services.implementations.transportation;

import com.PSTravelAggregator.models.transportation.TransportBookingDetails;
import com.PSTravelAggregator.repositories.transportation.TransportationRepository;
import com.PSTravelAggregator.services.transportation.TransportationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransportationServiceImpl implements TransportationService {

    @Autowired
    private TransportationRepository transportationRepository;

    @Override
    public TransportBookingDetails addBooking(TransportBookingDetails transportBookingDetails) { return transportationRepository.save(transportBookingDetails);}

    @Override
    public Optional<TransportBookingDetails> getBooking(int bookingId) { return transportationRepository.findById(bookingId);}

    @Override
    public Iterable<TransportBookingDetails> getBookingByUserId (String userId) { return transportationRepository.findByUserID(userId);}

    @Override
    public TransportBookingDetails updateBooking(TransportBookingDetails transportBookingDetails) { return transportationRepository.save(transportBookingDetails);}

    @Override
    public void deleteBooking(int bookingId) { transportationRepository.deleteById(bookingId);}

}
