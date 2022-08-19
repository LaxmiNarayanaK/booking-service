package com.PSTravelAggregator.controllers.accomodation;

import com.PSTravelAggregator.models.accomodation.AccommodationBookingDetails;
import com.PSTravelAggregator.services.accomodation.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequestMapping("/accommodation")
@RestController
public class AccommodationController {

    @Autowired
    AccommodationService accommodationService;

    @PostMapping("/save")
    public AccommodationBookingDetails create(@RequestBody AccommodationBookingDetails accommodationBookingDetails){
        return accommodationService.bookAccommodation(accommodationBookingDetails);
    }

    @GetMapping("/userBookings/{userID}")
    public List<AccommodationBookingDetails> getUserBookings(@PathVariable String userID){
        return accommodationService.getAccommodationByUserID(userID);
    }

    @GetMapping("/userAccommodation/{bookingID}")
    public Optional<AccommodationBookingDetails> getUserAccommodation(@PathVariable Integer bookingID){
        return accommodationService.getAccommodationByID(bookingID);
    }


}
