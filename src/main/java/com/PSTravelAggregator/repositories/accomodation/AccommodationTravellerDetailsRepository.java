package com.PSTravelAggregator.repositories.accomodation;

import com.PSTravelAggregator.models.accomodation.TravellerDetailsAccommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccommodationTravellerDetailsRepository extends JpaRepository<TravellerDetailsAccommodation, Integer> {
}
