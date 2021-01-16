package com.restaurantfinder.api.controllers;

import com.restaurantfinder.api.entities.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurants")
public class RestaurantsController {

    // Temp fake data
    private static final List<Restaurant> FAKE_DATA = Arrays.asList(
            new Restaurant("TESTID_1234", "Test Restaurant 01", "97", "West 99th Street", "Manhattan", "12345",
                    "12.1234567890", "12.1234567890"),
            new Restaurant("TESTID_5678", "Test Restaurant 02", "98", "West 99th Street", "Manhattan", "12345",
                    "12.1234567890", "12.1234567890"),
            new Restaurant("TESTID_9012", "Test Restaurant 03", "99", "West 99th Street", "Manhattan", "12345",
                    "12.1234567890", "12.1234567890")
    );

    @GetMapping("/{restaurantId}")
    public Restaurant getRestaurantById(@PathVariable String restaurantId){
        return FAKE_DATA.stream()
                .filter(restaurant -> restaurantId.equals(restaurant.getRestaurantId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Restaurant " + restaurantId + " does not exist"));
    }
}
