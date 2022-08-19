package com.PSTravelAggregator.controllers.traveller;

import com.PSTravelAggregator.models.traveller.SavedTraveller;
import com.PSTravelAggregator.services.traveller.TravellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/savedTraveller")
public class TravellerController {

    @Autowired
    TravellerService travellerService;

    @PostMapping
    @ResponseBody
    public SavedTraveller addTraveller(@RequestBody SavedTraveller savedTraveller) {
        return travellerService.addTraveller(savedTraveller);
    }

    @GetMapping("traveller/{id}")
    @ResponseBody
    public Optional<SavedTraveller> getTraveller(@PathVariable int id) {
        return travellerService.getTraveller(id);
    }

    @GetMapping("{id}")
    @ResponseBody
    public List<SavedTraveller> getTraveller(@PathVariable String id) {
        return (List<SavedTraveller>) travellerService.getTravellerByUserId(id);
    }

    @PutMapping
    @ResponseBody
    public SavedTraveller updateTraveller(@RequestBody SavedTraveller savedTraveller) {
        return travellerService.updateTraveller(savedTraveller);
    }

    @DeleteMapping("{id}")
    public void deleteTraveller(@PathVariable int id) {
        travellerService.deleteTraveller(id);
    }

}
