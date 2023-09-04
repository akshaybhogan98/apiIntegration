package com.example.api_integration.service;


import com.example.api_integration.dto.ResponseDto;

public interface ForecastByLocation {

    ResponseDto fetchForecastByLocation(String location);

    ResponseDto fetchHourlyForecastByLocation(String location);
}
