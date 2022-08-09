package com.dh.weather.services;

import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Override
    public Integer getWeather() {
        return 25;
    }
}
