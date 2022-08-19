package com.PSTravelAggregator.repositories.traveller;

import com.PSTravelAggregator.models.traveller.SavedTraveller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravellerRepository extends JpaRepository<SavedTraveller, Integer> {
    Iterable<SavedTraveller> findByUserID(String userID);
}
