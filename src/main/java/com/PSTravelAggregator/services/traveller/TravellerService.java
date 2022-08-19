package com.PSTravelAggregator.services.traveller;

import com.PSTravelAggregator.models.traveller.SavedTraveller;

import java.util.Optional;

public interface TravellerService {
    SavedTraveller addTraveller(SavedTraveller savedTraveller);

    Optional<SavedTraveller> getTraveller(int travellerId);

    SavedTraveller updateTraveller(SavedTraveller savedTraveller);

    void deleteTraveller(int travellerId);

    Iterable<SavedTraveller> getTravellerByUserId(String userId);
}
