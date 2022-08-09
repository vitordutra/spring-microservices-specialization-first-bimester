package com.dh.weather.resources;

import com.dh.weather.services.WeatherService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherResource {
    @Autowired
    private WeatherService service;

    @GetMapping
    private ResponseEntity<Integer> getWeather() {
        return ResponseEntity.ok(service.getWeather());
    }
}
