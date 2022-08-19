package com.PSTravelAggregator.repositories.transportation;

import com.PSTravelAggregator.models.transportation.TransportBookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportationRepository extends JpaRepository<TransportBookingDetails, Integer> {

    Iterable<TransportBookingDetails> findByUserID(String userID);
}
