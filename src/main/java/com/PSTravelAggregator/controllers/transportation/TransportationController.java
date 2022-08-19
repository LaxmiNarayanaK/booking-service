package com.PSTravelAggregator.controllers.transportation;

import com.PSTravelAggregator.models.transportation.TransportBookingDetails;
import com.PSTravelAggregator.services.transportation.TransportationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transport")
public class TransportationController {

    @Autowired
    TransportationService transportationService;

    @PostMapping
    public TransportBookingDetails addBooking(@RequestBody TransportBookingDetails transportBookingDetails){
        return transportationService.addBooking(transportBookingDetails);
    }

    @GetMapping("{userId}")
    @ResponseBody
    public List<TransportBookingDetails> getBookings(@PathVariable String userId) {
        return (List<TransportBookingDetails>) transportationService.getBookingByUserId(userId);
    }

    @GetMapping("/booking/{bookingId}")
    @ResponseBody
    public Optional<TransportBookingDetails> getBooking(@PathVariable int bookingId) {
        return transportationService.getBooking(bookingId);
    }

    @PutMapping
    @ResponseBody
    public TransportBookingDetails updateBooking(@RequestBody TransportBookingDetails transportBookingDetails) {
        return transportationService.updateBooking(transportBookingDetails);
    }

    @DeleteMapping("{bookingId}")
    public void deleteBooking(@PathVariable int bookingId) {
        transportationService.deleteBooking(bookingId);
    }

}
