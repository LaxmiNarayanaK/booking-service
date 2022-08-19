package com.PSTravelAggregator.services.implementations.traveller;

import com.PSTravelAggregator.models.traveller.SavedTraveller;
import com.PSTravelAggregator.repositories.traveller.TravellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TravellerServiceImpl implements com.PSTravelAggregator.services.traveller.TravellerService {

    @Autowired
    private TravellerRepository travellerRepository;

    @Override
    public SavedTraveller addTraveller(SavedTraveller savedTraveller) { return travellerRepository.save(savedTraveller);}

    @Override
    public Optional<SavedTraveller> getTraveller(int travellerId) { return travellerRepository.findById(travellerId);}

    @Override
    public SavedTraveller updateTraveller(SavedTraveller savedTraveller) { return travellerRepository.save((savedTraveller));}

    @Override
    public void deleteTraveller(int travellerId) { travellerRepository.deleteById(travellerId);}

    @Override
    public Iterable<SavedTraveller> getTravellerByUserId(String userID) { return travellerRepository.findByUserID(userID);}


}
