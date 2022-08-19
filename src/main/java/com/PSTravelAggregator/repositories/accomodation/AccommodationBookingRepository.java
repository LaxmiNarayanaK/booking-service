package com.PSTravelAggregator.repositories.accomodation;

import com.PSTravelAggregator.models.accomodation.AccommodationBookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccommodationBookingRepository extends JpaRepository<AccommodationBookingDetails,Integer> {
    List<AccommodationBookingDetails> findByUserID(String userID);

}
