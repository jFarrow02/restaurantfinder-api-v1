package com.restaurantfinder.api.controllers;

import com.restaurantfinder.api.entities.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/restaurants")
public class RestaurantsController {

    @GetMapping("/{restaurantId}")
    public Restaurant getRestaurantById(@PathVariable String restaurantId){
        return new Restaurant("TESTID_1234", "Test Restaurant", "99", "West 99th Street", "Manhattan", "12345",
                "12.1234567890", "12.1234567890");
    }
}
